/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributedtaxidriver.ServerHandlers;

import distributedtaxidriver.Constants.Constants;
import distributedtaxidriver.DataProcessor;
import distributedtaxidriver.KMeansHandlers.KMeansProcessor;
import distributedtaxidriver.POJO.Cluster;
import distributedtaxidriver.POJO.Driver;
import distributedtaxidriver.OutputHandlers.ServerOutputManager;
import distributedtaxidriver.WebServiceInteractionInterface;
import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abhishek
 */
public class Server extends AbstractServer {
   
    DataProcessor dataProcessor;
    KMeansProcessor kMeansProcessor;
    Double currentTimeSlot;
    ArrayList<Cluster> clusters;
    ServerOutputManager serverOutputManager;

    
    public Server(int port) {
        super(port);
        dataProcessor = new DataProcessor();
        kMeansProcessor = new KMeansProcessor();
        currentTimeSlot = -1.0 * Constants.INF;
        serverOutputManager = ServerOutputManager.getSingletonInstance();
    }
    
    public Server() {
        this(Constants.DEFAULT_PORT);
        System.out.println("Inside Server()");
    }
    
    @Override
    public void startServer() {
       // get Parent severSocket
       ServerSocket serverSocket;
       serverSocket = getServerSocket();
       acceptConnection(serverSocket);
    }
    
    public String getResult(DataInputStream in) { 
       
        
        Driver driver = new Driver();
        String stringLatLon;
        try {
            driver = dataProcessor.processInput(in.readUTF());
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        serverOutputManager.write("Currently Processing Client: " 
                + driver.getLatitude() + "," 
                + driver.getLongitude() + "," 
                + driver.getTime());
       
        String data = ""+driver.getLatitude() + driver.getLongitude();
        WebServiceInteractionInterface service;
        service = new WebServiceInteractionInterface(data,driver.getTime());
        return service.getBestDestination();
    }
    
    public void acceptConnection(ServerSocket serverSocket) {
        // Recieve requests till infinity
        while (true) {
            String output;
            try {
                System.out.println("Waiting for client on port " + 
                   serverSocket.getLocalPort() + "...");
                Socket server = serverSocket.accept();
                
                System.out.println("Just connected to " + server.getRemoteSocketAddress());
                
                DataInputStream in = new DataInputStream(server.getInputStream());
                
                output = getResult(in);
                
                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                serverOutputManager.write(output);
                out.writeUTF(output);
                
                System.out.println("\n\nSuccessfully Processed client...\n\n");
            } catch (IOException exception) {
                System.err.println("Received IO exception while waiting for Connection" + exception.getMessage());
            }
        }
    }
}
