package studyopedia;

import java.util.Scanner;

public class Remainder_Calculation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, Remainder;

        System.out.println("Enter the value of A:");
        A = sc.nextInt();  // Read the value of A

        System.out.println("Enter the value of B:");
        B = sc.nextInt();  // Read the value of B

        // Calculate remainder using modulus operation
        Remainder = B%A;
        // Corrected print statement
        System.out.println("A divided by B gives remainder: " + Remainder);

    }
}

