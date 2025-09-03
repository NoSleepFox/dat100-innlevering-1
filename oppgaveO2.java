
import java.util.Scanner;

public class oppgaveO2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String grade;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Skriv inn poengsumen: ");
            int score = input.nextInt();
            if (score > 100 || score < 0) {
                System.out.println("Student " + i + " har skrevet en ugyldig poengsum");
                i = i - 1;
            } else {
                if (score < 40) {
                    grade = "F";
                } else if (score < 50) {
                    grade = "E";
                } else if (score < 60) {
                    grade = "D";
                } else if (score < 80) {
                    grade = "C";
                } else if (score < 90) {
                    grade = "B";
                } else {
                    grade = "A";
                }
                System.out.println("Student " + i + " fikk karakteren: " + grade);
            }
        }
        input.close();
    }
}
