// filepath: project01/src/controlflow/SwitchCaseDemo.java
package controlflow;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected option 1.");
                break;
            case 2:
                System.out.println("You selected option 2.");
                break;
            case 3:
                System.out.println("You selected option 3.");
                break;
            default:
                System.out.println("Invalid option. Please select a number between 1 and 3.");
                break;
        }

        scanner.close();
    }
}