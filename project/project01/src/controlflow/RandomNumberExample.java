// filepath: project01/src/controlflow/RandomNumberExample.java
package controlflow;

import java.util.Random;

public class RandomNumberExample {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100); // Generates a random number between 0 and 99
        System.out.println("Generated Random Number: " + randomNumber);
    }
}