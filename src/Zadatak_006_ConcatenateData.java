import java.util.Scanner;

public class Zadatak_006_ConcatenateData {
    //Write a program that reads the name, surname, age, and city from the console and prints the following message:
    // "You are <firstName> <lastName>, a <age>-years old person from <town>."

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ime = scanner.nextLine();
        String prezime = scanner.nextLine();
        int godine = Integer.parseInt(scanner.nextLine());
        String grad = scanner.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.",
                ime, prezime, godine, grad);


    }
}
