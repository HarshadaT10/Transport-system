package entity;

import java.util.Date;

public class Trip {
    private int tripId;
    private int vehicleId;
    private int routeId;
    private Date departureDate;
    private Date arrivalDate;
    private String status;
    private String tripType;
    private int maxPassengers;

    public Trip(int tripId, int vehicleId, int routeId, Date departureDate, Date arrivalDate, String status, String tripType, int maxPassengers) {
        this.tripId = tripId;
        this.vehicleId = vehicleId;
        this.routeId = routeId;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.status = status;
        this.tripType = tripType;
        this.maxPassengers = maxPassengers;
    }

    public int getTripId() { return tripId; }
}