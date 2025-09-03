
import java.util.Scanner;

public class oppgaveO1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tax;
        System.out.print("Skriv inn inntekten din: ");
        int income = input.nextInt();
        if (income < 217401) {
            tax = 0;
        } else if (income < 306051) {
            tax = income * 0.017;
        } else if (income < 697151) {
            tax = income * 0.04;
        } else if (income < 942401) {
            tax = income * 0.137;
        } else if (income < 1410751) {
            tax = income * 0.167;
        } else {
            tax = income * 0.177;
        }
        System.out.println("Din trinnskat er: " + tax + "kr");
    }
}
