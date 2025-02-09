package main;
import dao.TransportManagementService;
import dao.TransportManagementServiceImpl;
import entity.Vehicle;

public class TransportManagementApp {
    public static void main(String[] args) {
        TransportManagementService service = new TransportManagementServiceImpl();
        
        Vehicle vehicle = new Vehicle(0, "Truck", 10.5, "Freight", "Available");
        if (service.addVehicle(vehicle)) {
            System.out.println("Vehicle added successfully!");
        }
    }
}