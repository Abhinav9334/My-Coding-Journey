package studyopedia;
import java.util.*;
public class HourstoMinutes {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int Minutes, Hours;
	System.out.println("Enter the value of hours");
	Hours = sc.nextInt();
	Minutes=60*Hours;
	System.out.println("the value in minutes is "+ Minutes);
	}
}
