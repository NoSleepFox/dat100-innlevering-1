
import java.util.Scanner;

public class oppgaveO3 {

    public static int number_fakultet(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * number_fakultet(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv inn et hell tall som er ikke negativt: ");
        int number = input.nextInt();
        if (number < 0) {
            System.out.println("Ugyldig tall");
        } else {
            int result = number_fakultet(number);
            System.out.println(number + "! = " + result);
        }

        input.close();
    }
}
