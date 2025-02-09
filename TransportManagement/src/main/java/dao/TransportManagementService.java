package dao;
import java.util.List;

import entity.Vehicle;

public interface TransportManagementService {
    boolean addVehicle(Vehicle vehicle);
    boolean deleteVehicle(int vehicleId);
    List<Vehicle> getAllVehicles();
}