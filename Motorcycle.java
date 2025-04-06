public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    // Constructor
    public Motorcycle(String make, String model, int year, boolean hasSidecar) {
        super(make, model, year);
        this.hasSidecar = hasSidecar;
    }

    // Override getInfo()
    @Override
    public String getInfo() {
        return super.getInfo() + "\t" + (hasSidecar ? "Has Sidecar" : "No Sidecar");
    }
}