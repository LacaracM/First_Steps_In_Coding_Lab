import java.util.Scanner;

public class Zadatak_007_ProjectsCreation {

    //7.	Projects Creation
    //Write a program that calculates how many hours it will take for an architect
    // to design several construction projects. The preparation of a project takes three hours.
    //Input Data
    //2 lines are read from the console:
    //1.	Name of the architect – string
    //2.	Number of projects to be prepared – an integer in the interval [0 … 100]
    //Output Data
    //On the console print:
    //•	"The architect {name of architect} will need {needed time} hours to complete {number of projects} project/s."

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ime = scanner.nextLine();
        int brojProjekata = Integer.parseInt(scanner.nextLine());
        int brojSati = brojProjekata * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.",
                ime, brojSati, brojProjekata);


    }
}

