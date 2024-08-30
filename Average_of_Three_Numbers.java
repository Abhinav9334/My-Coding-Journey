package studyopedia;
import java.util.*;
public class Average_of_Three_Numbers {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	float A,B,C;
	float Average;
	System.out.println("Enter the value of A");
	A = sc.nextFloat();
	System.out.println("Enter the value of B");
	B = sc.nextFloat();
	System.out.println("Enter the value of C");
	C = sc.nextFloat();
	Average = (A+B+C)/3;
	System.out.println("The Average value of A, B and C is " +Average);
	
	}
}
