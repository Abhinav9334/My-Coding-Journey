package studyopedia;
import java.util.*;
public class Square_of_Any_Numbers {

	public static void main(String[] args) {
		int number, square;
		System.out.println("Enter the value of number");
		Scanner sc = new Scanner (System.in);
		number = sc.nextInt();
		square = number*number;
		System.out.println("The square of the number enter " +number+ " is "+square);
	}
}
