/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributedtaxidriver.SlaveHandlers;

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
    
}
