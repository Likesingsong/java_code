// filepath: project01/src/controlflow/ScannerInputExample.java
package controlflow;

import java.util.Scanner;

public class ScannerInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = scanner.nextLine();

        System.out.println("Please enter your age:");
        int age = scanner.nextInt();

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        scanner.close();
    }
}