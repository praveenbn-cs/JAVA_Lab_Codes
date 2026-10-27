
class Vehicle {
    String vehicleNumber;
    String vehicleType;
    int parkingHours;

    static final double TWO_WHEELER_RATE = 20.0;
    static final double FOUR_WHEELER_RATE = 50.0;
    static final double HEAVY_VEHICLE_RATE = 100.0;

    private double amount;

    // Constructor
    Vehicle(String vehicleNumber, String vehicleType, int parkingHours) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.parkingHours = parkingHours;
    }

    // Calculate charges for two-wheelers
    void calculateCharges(int hours) {
        amount = hours * TWO_WHEELER_RATE;
    }

    // Overloaded method for four-wheelers
    void calculateCharges(double hours) {
        amount = hours * FOUR_WHEELER_RATE;
    }

    // Overloaded method for heavy vehicles
    void calculateCharges(String type, int hours) {
        amount = hours * HEAVY_VEHICLE_RATE;
    }

    // Access private amount
    double getAmount() {
        return amount;
    }

    // Display bill by accepting a Vehicle object
    static void displayBill(Vehicle v) {
        System.out.println("\n----- Parking Bill -----");
        System.out.println("Vehicle Number: " + v.vehicleNumber);
        System.out.println("Vehicle Type: " + v.vehicleType);
        System.out.println("Parking Hours: " + v.parkingHours);
        System.out.println("Parking Amount: Rs. " + v.getAmount());
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("KA01AB1234", "Two-Wheeler", 3);
        Vehicle v2 = new Vehicle("KA02CD5678", "Four-Wheeler", 4);
        Vehicle v3 = new Vehicle("KA03EF9012", "Heavy Vehicle", 2);

        v1.calculateCharges(v1.parkingHours);
        v2.calculateCharges((double) v2.parkingHours);
        v3.calculateCharges(v3.vehicleType, v3.parkingHours);

        displayBill(v1);
        displayBill(v2);
        displayBill(v3);
    }
}
