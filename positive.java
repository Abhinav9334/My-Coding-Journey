package studyopedia;

import java.util.Scanner;

public class positive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Enter a number:");
        number = sc.nextInt(); // Reads an integer input from the user

        if (number > 0) {
            System.out.println("The number is Positive");
        } else if (number == 0) {
            System.out.println("The number is Zero");
        } else {
            System.out.println("The number is Negative");
        }

           }
}
