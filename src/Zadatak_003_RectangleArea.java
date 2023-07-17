import java.util.Scanner;

public class Zadatak_003_RectangleArea {

    //3.	Rectangle Area
    //Write a Java program that calculates and prints the area of a rectangle
    // with predefined sides a and b.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        a = Integer.parseInt(scanner.nextLine());
        b = Integer.parseInt(scanner.nextLine());

        int povrsina = a * b;
        System.out.println(povrsina);


    }
}
