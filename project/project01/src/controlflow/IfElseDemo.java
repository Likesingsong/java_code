// filepath: project01/src/controlflow/IfElseDemo.java
package controlflow;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("You received an A!");
        } else if (score >= 80) {
            System.out.println("You received a B!");
        } else if (score >= 70) {
            System.out.println("You received a C!");
        } else if (score >= 60) {
            System.out.println("You received a D!");
        } else {
            System.out.println("You received an F.");
        }

        scanner.close();
    }
}