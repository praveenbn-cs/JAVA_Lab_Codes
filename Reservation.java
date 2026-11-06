
import java.util.Scanner;


class SeatAlreadyBookedException extends Exception {
    SeatAlreadyBookedException(String msg) {
        super(msg);
    }
}

public class Reservation {

    boolean seats[] = new boolean[6];

    void reserveSeat(int seatNo) throws SeatAlreadyBookedException {

        if (seatNo < 1 || seatNo > 5) {
            throw new IllegalArgumentException("Invalid seat number!");
        }

        if (seats[seatNo]) {
            throw new SeatAlreadyBookedException("Seat already booked!");
        }

        seats[seatNo] = true;
        System.out.println("Seat " + seatNo + " reserved successfully.");
    }

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        Reservation r = new Reservation();

        try {
            System.out.print("Enter seat number (1-5): ");
            int seat = sc.nextInt();

            r.reserveSeat(seat);

            System.out.print("Enter another seat number: ");
            seat = sc.nextInt();

            r.reserveSeat(seat);
        }

        catch (SeatAlreadyBookedException e) {
            System.out.println(e.getMessage());
        }

        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        catch (java.util.InputMismatchException e) {
            System.out.println("Incorrect input! Enter a number.");
        }

        finally {
            System.out.println("Transaction completed.");
        }
    }
}
