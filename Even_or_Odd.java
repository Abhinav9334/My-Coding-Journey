package studyopedia;
import java.util.*;
public class Even_or_Odd {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int number;
		System.out.println("Enter the value of number :");
		number = sc.nextInt();
		if(number%2==0) {
			System.out.println("The number is Even");
		}
		else{
			System.out.println("The number is Odd");
		}
	}
}
