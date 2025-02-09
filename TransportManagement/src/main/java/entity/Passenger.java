package entity;

public class Passenger {
    private int passengerId;
    private String firstName;
    private String gender;
    private int age;
    private String email;
    private String phoneNumber;

    public Passenger(int passengerId, String firstName, String gender, int age, String email, String phoneNumber) {
        this.passengerId = passengerId;
        this.firstName = firstName;
        this.gender = gender;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getPassengerId() { return passengerId; }
}