import java.util.Scanner;

public class Zadatak_005_GreetingByName {

    //Write a program that reads text (person's name) from the console and prints "Hello, <name>!",
    // where <name> is the name entered from the console.

    public static void main(String[] args) {

        String ime;
        Scanner scanner = new Scanner(System.in);
        ime = scanner.nextLine();
        System.out.println("Hello, " + ime + "!");


    }
}
