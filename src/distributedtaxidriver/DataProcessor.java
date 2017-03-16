/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributedtaxidriver;

import distributedtaxidriver.POJO.Cluster;
import distributedtaxidriver.POJO.DataPoint;
import distributedtaxidriver.POJO.Driver;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * TODO Make it singleton
 * @author Abhishek
 */
public class DataProcessor {
    
    /**
     * Parse string and get time to identify driver
     * @param in String to be parsed
     * @return 
     */
    public Driver processInput(String in) {
        Driver driver = new Driver();
        Calendar calendar = Calendar.getInstance();
        // Process input stream to get Lat, Lon and add server time

        Double timeInMinutes = (calendar.get(Calendar.HOUR_OF_DAY) * 60.0) + (calendar.get(Calendar.MINUTE));
        String[] latLon = in.split(",");
        
        System.out.println("Request is received at:" + calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE));
        
        driver.setTime(timeInMinutes);
        driver.setLatitude(Double.parseDouble(latLon[0]));
        driver.setLongitude(Double.parseDouble(latLon[1]));
        
        return driver;
    }
    
    public Integer getBestCluster(ArrayList<Cluster> clusters, Driver driver) {
        return 0;
    }
    
    public String convertClusterToString(Integer id, ArrayList<Cluster> clusters) {
        String result = "abc";
        return result;
    }
    
    public ArrayList<DataPoint> getCustData(double time, ArrayList<DataPoint> data)
    {
        ArrayList<DataPoint> temp = new ArrayList();
        int i, pos = 0;
        for(i=0; i<data.size(); i++)
        {
            if(data.get(i).getTime() >=  time)
            {
                pos = i;
                break;
            }
        }
        i = pos;
        while(i < (pos + Constants.forwardWindowWidth))
        {
            i++;
            DataPoint D =  new DataPoint();
            D.setLat(data.get(i%data.size()).getLat());
            D.setLon(data.get(i%data.size()).getLon());
            temp.add(D);
        }
        i = pos;
        while(i > (pos - Constants.backwardWindowWidth))
        {
            i--;
            DataPoint D = new DataPoint();
            D.setLat(data.get((i+data.size())%data.size()).getLat());
            D.setLon(data.get((i+data.size())%data.size()).getLon());
            temp.add(D);
        }
        return temp;
    }
}
