//Extract Integer and Decimal Parts Using Type Casting


import java.util.Scanner;

class AmountParts {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an amount: ");
        double amount = sc.nextDouble();

        int integerPart = (int) amount;
        double decimalPart = amount - integerPart;

        System.out.println("Integer part: " + integerPart);
        System.out.println("Decimal part: " + decimalPart);

        sc.close();
    }
}