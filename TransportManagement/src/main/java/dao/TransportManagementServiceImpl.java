package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Vehicle;
import util.DBConnectionUtil;

public class TransportManagementServiceImpl implements TransportManagementService {
    private Connection conn;

    public TransportManagementServiceImpl() {
        this.conn = DBConnectionUtil.getConnection();
    }

    @Override
    public boolean addVehicle(Vehicle vehicle) {
        String query = "INSERT INTO Vehicles (model, capacity, type, status) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, vehicle.getModel());
            stmt.setDouble(2, vehicle.getCapacity());
            stmt.setString(3, vehicle.getType());
            stmt.setString(4, vehicle.getStatus());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteVehicle(int vehicleId) {
        String query = "DELETE FROM Vehicles WHERE vehicleId = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, vehicleId);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        String query = "SELECT * FROM Vehicles";
        try (PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Vehicle vehicle = new Vehicle(
                    rs.getInt("vehicleId"),
                    rs.getString("model"),
                    rs.getDouble("capacity"),
                    rs.getString("type"),
                    rs.getString("status")
                );
                vehicles.add(vehicle);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vehicles;
    }
}