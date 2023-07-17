import java.util.Scanner;

public class Zadatak_004_InchesToCentimeters {

    //Write a program that reads a floating-point number from the console and converts it from inches to centimeters.
    // To do this, multiply the inches by 2.54 (1 inch = 2.54 centimeters).
    public static void main(String[] args) {

        double brojIncha;
        Scanner scanner = new Scanner(System.in);

        brojIncha = Double.parseDouble(scanner.nextLine());
        double brojCm = brojIncha * 2.54;
        System.out.println(brojCm);

    }
}
