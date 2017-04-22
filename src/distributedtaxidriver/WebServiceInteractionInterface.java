/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributedtaxidriver;
import org.uber.main.*;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.ws.Dispatch;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Service;
import java.io.StringReader;

/**
 *
 * @author archit08jain
 */
public class WebServiceInteractionInterface {
   
    private String driverPosition;
    private Double time;

    public String getDriverPosition() {
        return driverPosition;
    }

    public void setDriverPosition(String driverPosition) {
        this.driverPosition = driverPosition;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }
    
    public WebServiceInteractionInterface(String position, Double timestamp) {
        driverPosition = position;
        time = timestamp;
        System.err.println(timestamp);
    }
    
    public String getBestDestination() {
        return getDestinationCoordinates_1(driverPosition,time);
    }


    private static String getDestinationCoordinates_1(java.lang.String arg0, java.lang.Double arg1) {
        System.err.println("Reached API call!" + arg0 + arg1);
        org.uber.main.DistributedTaxiDriver_Service service = new org.uber.main.DistributedTaxiDriver_Service();
        org.uber.main.DistributedTaxiDriver port = service.getDistributedTaxiDriverPort();
        return port.getDestinationCoordinates(arg0, arg1);
    }
}
