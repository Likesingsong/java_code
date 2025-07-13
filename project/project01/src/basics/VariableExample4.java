// filepath: project01/src/basics/VariableDemo4.java
package basics;

/*
 * VariableExample4
 * This class concludes the variable examples with more complex scenarios.
 */
public class VariableExample4 {
    public static void main(String[] args) {
        // Example of complex variable usage
        double radius = 5.0;
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle with radius " + radius + " is: " + area);

        // Example of type casting
        int intValue = 10;
        double doubleValue = intValue; // Implicit casting
        System.out.println("The double value is: " + doubleValue);

        // Example of explicit casting
        double anotherDoubleValue = 9.78;
        int anotherIntValue = (int) anotherDoubleValue; // Explicit casting
        System.out.println("The integer value after casting is: " + anotherIntValue);
    }
}