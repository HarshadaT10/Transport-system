package entity;


public class Route {
    private int routeId;
    private String startDestination;
    private String endDestination;
    private double distance;

    public Route(int routeId, String startDestination, String endDestination, double distance) {
        this.routeId = routeId;
        this.startDestination = startDestination;
        this.endDestination = endDestination;
        this.distance = distance;
    }

    public int getRouteId() { return routeId; }
    public String getStartDestination() { return startDestination; }
    public String getEndDestination() { return endDestination; }
    public double getDistance() { return distance; }
}