package studyopedia;
import java.util.*;
public class Number_of_days_in_a_week {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int days,weeks;
	System.out.println("Enter the number of weeks");
	weeks = sc.nextInt();
	days=7*weeks;
	System.out.println("The number of days in the week is " +days);
}
}