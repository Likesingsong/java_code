// filepath: project01/src/controlflow/IfElseSortDemo.java
package controlflow;

import java.util.Scanner;

public class IfElseSortingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        
        System.out.println("Sorting the numbers in descending order:");
        
        if (num1 >= num2 && num1 >= num3) {
            System.out.print(num1 + " ");
            if (num2 >= num3) {
                System.out.print(num2 + " " + num3);
            } else {
                System.out.print(num3 + " " + num2);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.print(num2 + " ");
            if (num1 >= num3) {
                System.out.print(num1 + " " + num3);
            } else {
                System.out.print(num3 + " " + num1);
            }
        } else {
            System.out.print(num3 + " ");
            if (num1 >= num2) {
                System.out.print(num1 + " " + num2);
            } else {
                System.out.print(num2 + " " + num1);
            }
        }
        
        scanner.close();
    }
}