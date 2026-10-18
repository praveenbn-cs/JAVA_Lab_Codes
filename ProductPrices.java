import java.util.Scanner;

public class ProductPrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] prices = new double[10];
        double sum = 0;
        double max, min;
        int count = 0;

        System.out.println("Enter prices of 10 products:");

        // Read product prices
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter price of product " + (i + 1) + ": ");
            prices[i] = sc.nextDouble();
            sum = sum + prices[i];

            if (prices[i] > 1000) {
                count++;
            }
        }

        // Initialize maximum and minimum
        max = prices[0];
        min = prices[0];

        // Find maximum and minimum prices
        for (int i = 1; i < 10; i++) {
            if (prices[i] > max) {
                max = prices[i];
            }

            if (prices[i] < min) {
                min = prices[i];
            }
        }

        // Calculate average price
        double average = sum / 10;

        // Display results
        System.out.println("\nMost expensive product: Rs. " + max);
        System.out.println("Least expensive product: Rs. " + min);
        System.out.println("Average price: Rs. " + average);
        System.out.println("Number of products costing more than Rs. 1000: " + count);

        sc.close();
    }
}