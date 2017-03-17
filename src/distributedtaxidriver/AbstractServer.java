/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributedtaxidriver;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abhishek
 */
public abstract class AbstractServer {
    private ServerSocket serverSocket;
    private Integer port;
    
    public ServerSocket getServerSocket() {
        return serverSocket;
    }

    public Integer getPort() {
        return port;
    }

    /**
     * Constructor when port is given.
     * @param port port on which server is to be started.
     */
    public AbstractServer(Integer port) {
        System.out.println("Inside Abstract Server()");
        this.port = port;
        try {
            serverSocket = new ServerSocket(this.port);
        } catch (IOException ex) {
            System.err.println("IOException while creating server Socket");
            Logger.getLogger(AbstractServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Constructor when port is not given.
     */
    public AbstractServer() {
        this(Constants.DEFAULT_PORT);
    }
    abstract void startServer();
}
