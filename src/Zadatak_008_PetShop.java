import java.util.Scanner;

public class Zadatak_008_PetShop {
    //8.	Pet Shop
    //Write a program that calculates the cost of buying dog and cat food.
    // The food is bought from a pet store, as one package of dog food costs 2.50 USD, and a package of cat food costs 4 USD.
    //Input Data
    //2 lines are read from the console:
    //1.	Number of packages of dog food - an integer in the range [0… 100]
    //2.	Number of packages of cat food - an integer in the range [0… 100]
    //Output Data
    //On the console print:
    //"{Total sum} USD"
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dog = Integer.parseInt(scanner.nextLine());
        int cat = Integer.parseInt(scanner.nextLine());
        double dogCost = dog * 2.50;
        double catCost = cat * 4;
        double totalCost = dogCost + catCost;

        System.out.printf("%.1f USD.",
                totalCost);
    }
}
