
import java.util.Scanner;

interface ParkingCharge {
    void calculateCharge();

    void displayParkingDetails();
}

class VehicleParking {
    String vehicleNumber;
    String vehicleType;
    int parkingHours;

    VehicleParking(String vehicleNumber, String vehicleType, int parkingHours) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.parkingHours = parkingHours;
    }
}

class TwoWheeler extends VehicleParking implements ParkingCharge {
    double charge;

    TwoWheeler(String number, int hours) {
        super(number, "Two Wheeler", hours);
    }

    public void calculateCharge() {
        if (parkingHours <= 2) {
            charge = parkingHours * 20;
        } else {
            charge = (2 * 20) + ((parkingHours - 2) * 10);
        }
    }

    public void displayParkingDetails() {
        System.out.println("\n--- Two Wheeler Parking Details ---");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Parking Hours: " + parkingHours);
        System.out.println("Total Parking Charge: Rs. " + charge);
    }
}

class FourWheeler extends VehicleParking implements ParkingCharge {
    double charge;

    FourWheeler(String number, int hours) {
        super(number, "Four Wheeler", hours);
    }

    public void calculateCharge() {
        if (parkingHours <= 2) {
            charge = parkingHours * 50;
        } else {
            charge = (2 * 50) + ((parkingHours - 2) * 30);
        }
    }

    public void displayParkingDetails() {
        System.out.println("\n--- Four Wheeler Parking Details ---");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Parking Hours: " + parkingHours);
        System.out.println("Total Parking Charge: Rs. " + charge);
    }
}

public class ParkingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Two Wheeler");
        System.out.println("2. Four Wheeler");
        System.out.print("Enter vehicle type: ");
        int choice = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter vehicle number: ");
        String number = sc.nextLine();

        System.out.print("Enter parking hours: ");
        int hours = sc.nextInt();

        if (hours < 0) {
            System.out.println("Parking hours cannot be negative.");
        } else {
            ParkingCharge parking;

            if (choice == 1) {
                parking = new TwoWheeler(number, hours);
            } else if (choice == 2) {
                parking = new FourWheeler(number, hours);
            } else {
                System.out.println("Invalid vehicle type.");
                sc.close();
                return;
            }

            parking.calculateCharge();
            parking.displayParkingDetails();
        }

        sc.close();
    }
}
