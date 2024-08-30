
package studyopedia;
import java.util.*;
public class Simple_Interest {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int principle,rate,time;
	int Simple_Interest;
	System.out.println("Enter the value of principle :");
	principle = sc.nextInt();
	System.out.println("Enter the value of rate :");
	rate = sc.nextInt();
	System.out.println("Enter the value of time :");
	time = sc.nextInt();
	Simple_Interest = (principle*rate*time)/100;
	System.out.println("The Simple Interest is :" + Simple_Interest);
}
}

/*
package studyopedia;

import java.util.Scanner;

public class Simple_Interest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principle, rate, time;
        int simpleInterest;

        System.out.println("Enter the value of principle:");
        principle = sc.nextInt();

        System.out.println("Enter the value of rate:");
        rate = sc.nextInt();

        System.out.println("Enter the value of time:");
        time = sc.nextInt();

        // Calculate simple interest
        simpleInterest = (principle * rate * time) / 100;

        // Corrected print statement
        System.out.println("The Simple Interest is: " + simpleInterest);

        sc.close(); // Close the Scanner object
    }
}
*/