// filepath: project01/src/basics/StringDemo.java
package basics;

public class StringExample {
    public static void main(String[] args) {
        String greeting = "Hello, World!";
        System.out.println(greeting);

        // String manipulation examples
        String name = "Alice";
        String message = greeting + " My name is " + name + ".";
        System.out.println(message);

        // Finding the length of a string
        int length = greeting.length();
        System.out.println("Length of greeting: " + length);

        // Converting to uppercase
        String upperCaseGreeting = greeting.toUpperCase();
        System.out.println("Uppercase greeting: " + upperCaseGreeting);

        // Checking if a string contains a substring
        boolean containsWorld = greeting.contains("World");
        System.out.println("Contains 'World': " + containsWorld);
    }
}