
import java.util.Scanner;
class SeatAlreadyBookedException extends Exception {
    SeatAlreadyBookedException(String message) {
        super(message);
    }
}

class Reservation1 {
boolean[] seats = new boolean[6];

 void reserveSeat(int seatNo) throws SeatAlreadyBookedException {
 if (seatNo < 1 || seatNo > 5) {
            throw new IllegalArgumentException("Invalid seat number!");
        }
 if (seats[seatNo]) {
  throw new SeatAlreadyBookedException("Seat is already booked!");
 }

  seats[seatNo] = true;
System.out.println("Seat " + seatNo + " booked successfully!");
    }
}

public class Main10 {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
Reservation1 r = new Reservation1();

 try {
 System.out.print("Enter seat number (1-5): ");
int seat = sc.nextInt();

  r.reserveSeat(seat);
  }

 catch (SeatAlreadyBookedException e) {
            System.out.println("Error: " + e.getMessage());
 }

  catch (IllegalArgumentException e) {
    System.out.println("Error: " + e.getMessage());
   }

  catch (Exception e) {
 System.out.println("Incorrect input! Please enter a number.");
  }

 finally {
 System.out.println("Transaction completed.");
sc.close();
 }
}
}
