// filepath: project01/src/exercises/TemperatureConverter.java
package exercises;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", celsius, fahrenheit);
        
        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = scanner.nextDouble();
        
        celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.printf("%.2f Fahrenheit is %.2f Celsius%n", fahrenheit, celsius);
        
        scanner.close();
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}