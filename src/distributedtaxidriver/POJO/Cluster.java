/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributedtaxidriver.POJO;

/**
 * Cluster POJO class to keep details related to Cluster.
 * Used for hypothesis calculations.
 * @author Abhishek
 */
public class Cluster {

    public Double getCrowdDensity() {
        return crowdDensity;
    }

    public void setCrowdDensity(Double crowdDensity) {
        this.crowdDensity = crowdDensity;
    }

    public Double getCrowdCount() {
        return crowdCount;
    }

    public void setCrowdCount(Double crowdCount) {
        this.crowdCount = crowdCount;
    }

    public Integer getDrivers() {
        return drivers;
    }

    public void setDrivers(Integer drivers) {
        this.drivers = drivers;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getTimeToReachCenter() {
        return timeToReachCenter;
    }

    public void setTimeToReachCenter(Double timeToReachCenter) {
        this.timeToReachCenter = timeToReachCenter;
    }
    private Double crowdDensity;
    private Double crowdCount;
    private Integer drivers;
    private Double distance;
    private Double timeToReachCenter;
}
