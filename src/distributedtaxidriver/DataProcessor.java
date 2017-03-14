/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributedtaxidriver;

import distributedtaxidriver.POJO.Cluster;
import distributedtaxidriver.POJO.Driver;
import java.util.ArrayList;

/**
 * TODO Make it singleton
 * @author Abhishek
 */
public class DataProcessor {
    public Driver processInput(String in) {
        Driver driver = new Driver();
        // Process input stream to get Lat, Lon and add server time
        
        return driver;
    }
    
    public Integer getBestCluster(ArrayList<Cluster> clusters, Driver driver) {
        return 0;
    }
    
    public String convertClusterToString(Integer id, ArrayList<Cluster> clusters) {
        String result = "abc";
        return result;
    }
}
