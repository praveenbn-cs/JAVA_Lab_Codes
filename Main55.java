
class BusReservation {
    int availableSeats = 1;

void bookSeatWithoutSync(String customer) {
        if (availableSeats > 0) {
            System.out.println(customer + " is trying to book the seat.");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            availableSeats--;
            System.out.println(customer + " successfully booked the seat.");
        } else {
            System.out.println(customer + " failed to book the seat. No seats available.");
        }
    }

  synchronized void bookSeatWithSync(String customer) {
        if (availableSeats > 0) {
            System.out.println(customer + " is trying to book the seat.");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            availableSeats--;
            System.out.println(customer + " successfully booked the seat.");
        } else {
            System.out.println(customer + " failed to book the seat. No seats available.");
        }
    }
}

class Customer extends Thread {
    BusReservation bus;
    boolean useSync;

    Customer(BusReservation bus, String name, boolean useSync) {
        super(name);
        this.bus = bus;
        this.useSync = useSync;
    }

    public void run() {
        if (useSync) {
            bus.bookSeatWithSync(getName());
        } else {
            bus.bookSeatWithoutSync(getName());
        }
    }
}

public class Main55 {
    public static void main(String[] args) {

        System.out.println("WITHOUT SYNCHRONIZATION");

        BusReservation bus1 = new BusReservation();

        Customer c1 = new Customer(bus1, "Customer 1", false);
        Customer c2 = new Customer(bus1, "Customer 2", false);

        c1.start();
        c2.start();

        try {
            c1.join();
            c2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("\nWITH SYNCHRONIZATION");

        BusReservation bus2 = new BusReservation();

        Customer c3 = new Customer(bus2, "Customer 1", true);
        Customer c4 = new Customer(bus2, "Customer 2", true);

        c3.start();
        c4.start();

        try {
            c3.join();
            c4.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
