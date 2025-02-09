package entity;

import java.util.Date;

public class Booking {
    private int bookingId;
    private int tripId;
    private int passengerId;
    private Date bookingDate;
    private String status;

    public Booking(int bookingId, int tripId, int passengerId, Date bookingDate, String status) {
        this.bookingId = bookingId;
        this.tripId = tripId;
        this.passengerId = passengerId;
        this.bookingDate = bookingDate;
        this.status = status;
    }

    public int getBookingId() { return bookingId; }
}