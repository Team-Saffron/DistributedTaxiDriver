/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributedtaxidriver;

import distributedtaxidriver.POJO.Driver;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Abhishek
 */
public class Server extends AbstractServer {
   
    public Server(int port) {
        super(port);
    }
    
    public Server() {
        super();
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
        Driver driver = processInput(in);
        return "Taxi Driver";
    }

    public Driver processInput(DataInputStream in) {
        Driver driver = new Driver();
        // Code for parsing input and set Time.
        return driver;
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
                out.writeUTF("Thank you for connecting to " + server.getLocalSocketAddress()
                    + "\nYour ouput is:" + output
                    + "\nGoodbye!");
                
            } catch (IOException exception) {
                System.err.println("Received IO exception while waiting for Connection" + exception.getMessage());
            }
        }
    }
}
