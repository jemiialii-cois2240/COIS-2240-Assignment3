// Task1.java
// Generated from Umple Diagram
// Author: Jemima Ali

import java.util.Scanner;

class Vehicle {
    private String licencePlate;
    private String make;
    private String model;
    private int year;

    public Vehicle(String licencePlate, String make, String model, int year) {
        this.licencePlate = licencePlate;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getInfo() {
        return year + " " + make + " " + model + " (" + licencePlate + ")";
    }

    // Getters and setters omitted for brevity
}









