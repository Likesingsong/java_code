// filepath: project01/src/controlflow/TicketPriceDemo.java
package controlflow;

import java.util.Scanner;

public class TicketPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the original ticket price: ");
        double price = scanner.nextDouble();
        
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        
        System.out.print("Enter the class type (First Class, Economy): ");
        String classType = scanner.next();
        
        double finalPrice = calculateTicketPrice(price, month, classType);
        System.out.println("The final ticket price is: " + finalPrice);
        
        scanner.close();
    }

    public static double calculateTicketPrice(double basePrice, int month, String classType) {
        if (month >= 5 && month <= 10) { // Peak season
            switch (classType) {
                case "Economy":
                    basePrice *= 0.85;
                    break;
                case "First Class":
                    basePrice *= 0.90;
                    break;
                default:
                    System.out.println("Invalid class type entered.");
                    return -1; // Indicates an error
            }
        } else { // Off-peak season
            switch (classType) {
                case "Economy":
                    basePrice *= 0.65;
                    break;
                case "First Class":
                    basePrice *= 0.70;
                    break;
                default:
                    System.out.println("Invalid class type entered.");
                    return -1; // Indicates an error
            }
        }
        return basePrice;
    }
}