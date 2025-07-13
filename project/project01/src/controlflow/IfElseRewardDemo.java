// filepath: project01/src/controlflow/IfElseRewardDemo.java
package controlflow;

import java.util.Scanner;

public class IfElseRewardDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the score: ");
        int score = scanner.nextInt();

        if (score == 100) {
            System.out.println("Reward: A sports car!");
        } else if (score >= 80) {
            System.out.println("Reward: A mountain bike!");
        } else if (score >= 60) {
            System.out.println("Reward: A day trip to Universal Studios!");
        } else {
            System.out.println("Reward: A good spanking!");
        }

        scanner.close();
    }
}