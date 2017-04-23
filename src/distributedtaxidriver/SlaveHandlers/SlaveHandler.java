/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributedtaxidriver.SlaveHandlers;

import distributedtaxidriver.POJO.Cluster;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Abhishek
 */
public class SlaveHandler {

    private static Integer getDestinationCoordinates(java.lang.String arg0, java.util.List<org.uber.main.Cluster> arg1) {
        org.uber.main.DistributedTaxiDriver_Service service = new org.uber.main.DistributedTaxiDriver_Service();
        org.uber.main.DistributedTaxiDriver port = service.getDistributedTaxiDriverPort();
        return port.getDestinationCoordinates(arg0, arg1);
    }
    
    private static ArrayList<org.uber.main.Cluster> convertClusterMasterToSlave(List<Cluster> arg1) {
        ArrayList<org.uber.main.Cluster> result = new ArrayList<>();
        for (Cluster cluster : arg1) {
            org.uber.main.Cluster tempCluster = new org.uber.main.Cluster();
            tempCluster.setCentroidLatitude(cluster.getCentroidLatitude());
            tempCluster.setCentroidLongitude(cluster.getCentroidLongitude());
            tempCluster.setCrowdCount(cluster.getCrowdCount());
            tempCluster.setCrowdDensity(cluster.getCrowdDensity());
            tempCluster.setDrivers(cluster.getDrivers());
            result.add(tempCluster);
        }
        return result;
    }
    public static Integer getDestinationId(String arg0, List<Cluster> arg1) {
        ArrayList<org.uber.main.Cluster> clusters = convertClusterMasterToSlave(arg1);
        return getDestinationCoordinates(arg0, clusters);
    }
    
    
}
