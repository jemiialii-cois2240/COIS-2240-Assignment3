// Task1.java
// Generated from Umple Diagram
// Author: Jemima Ali
//
//
//

public class Vehicle {
    private String licencePlate;
    private String make;
    private String model;
    private int year;

    public Vehicle(String licencePlate, String make, String model, int year) {
        if (licencePlate == null || !licencePlate.matches("[A-Z0-9]{6}")) {
            throw new IllegalArgumentException("Invalid license plate.");
        }

        this.licencePlate = licencePlate;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getInfo() {
        return year + " " + make + " " + model + " (" + licencePlate + ")";
    }
}


// Jemima Ali






