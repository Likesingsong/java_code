// filepath: project01/src/basics/IdentifierExample.java
package basics;

/**
 * IdentifierExample
 * 
 * This class demonstrates the use of identifiers in Java, including naming conventions and rules.
 */
public class IdentifierExample {
    public static void main(String[] args) {
        int validIdentifier = 10; // Valid identifier
        int _anotherValidIdentifier = 20; // Valid identifier
        int $alsoValidIdentifier = 30; // Valid identifier
        // int 1invalidIdentifier = 40; // Invalid identifier, cannot start with a number

        System.out.println("Valid Identifiers:");
        System.out.println("validIdentifier: " + validIdentifier);
        System.out.println("_anotherValidIdentifier: " + _anotherValidIdentifier);
        System.out.println("$alsoValidIdentifier: " + $alsoValidIdentifier);
    }
}