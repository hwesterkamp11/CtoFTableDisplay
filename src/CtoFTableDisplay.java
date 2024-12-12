import java.util.Scanner;
public class CtoFTableDisplay {
    public static void main(String[] args) {
        System.out.printf("%-15s%-15s\n", "Celsius", "Fahrenheit");
        for (int celsius = -100; celsius <= 100; celsius++) {
            // Print the Celsius and Fahrenheit values in the table
            System.out.printf("%-15d%-15.2f\n", celsius, CtoF(celsius));
        }
    }

    public static double CtoF(double Celsius) {
        return (Celsius * 9 / 5) + 32;
    }
}
