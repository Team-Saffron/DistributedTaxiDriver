/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributedtaxidriver;

import distributedtaxidriver.OutputHandlers.ServerOutput;
import distributedtaxidriver.ServerHandlers.Server;
import distributedtaxidriver.ServerHandlers.AbstractServer;

/**
 *
 * @author Abhishek
 */
public class DistributedTaxiDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       new DistributedTaxiDriver().start();
    }
    
    public void start() {
        ServerOutput serverOutput = new ServerOutput();
        serverOutput.execute();
        AbstractServer server = new Server();
        server.startServer();
    }
}
