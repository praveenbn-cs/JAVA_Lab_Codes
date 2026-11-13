
import java.util.Scanner;

public class EmailOperations {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

          System.out.print("Enter student email address: ");
        String email = sc.nextLine();

       
          System.out.println("\n1. Length of email: " + email.length());

  
int at = email.indexOf('@');
    String username = email.substring(0, at);
        System.out.println("2. Username: " + username);

 
   String domain = email.substring(at + 1);
        System.out.println("3. Domain: " + domain);

   if (domain.equals("bmsce.ac.in")) {
            System.out.println("Email belongs to BMSCE institution.");
   } else {
            System.out.println("Email does not belong to BMSCE institution.");
        }

   String lower = email.toLowerCase();
        System.out.println("4. Lowercase email: " + lower);

        System.out.print("\nEnter registration number prefix: ");
   String prefix = sc.nextLine();

    if (email.startsWith(prefix)) {
            System.out.println("Email starts with the given prefix.");
    } else {
            System.out.println("Email does not start with the given prefix.");
        }

   if (email.endsWith("bmsce.ac.in")) {
            System.out.println("6. Email ends with valid domain.");
    } else {
            System.out.println("6. Email does not end with valid domain.");
        }
    String updated = email.replace("bmsce.ac.in", "cse.bmsce.ac.in");
        System.out.println("7. Updated email: " + updated);


        System.out.print("\nEnter character or sequence to search: ");
   String search = sc.nextLine();

    if (email.contains(search)) {
            System.out.println("8. Email contains " + search);
     } else {
            System.out.println("8. Email does not contain " + search);
        }

    
  String trimmed = email.trim();
  System.out.println("9. Trimmed email: " + trimmed);

   System.out.print("\nEnter another email address: ");
   String email2 = sc.nextLine();

  if (email.trim().equalsIgnoreCase(email2.trim())) {
            System.out.println("10. Both email addresses are identical.");
  } else {
            System.out.println("10. Both email addresses are different.");
        }

        sc.close();
    }
}
