package studyopedia;

import java.util.*;
public class Celcius_to_Farenheit {

	public static void main(String[] args) {
		int celcius, farenheit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of celcius :");
		celcius = sc.nextInt();
		farenheit=celcius*9/5+32;
		System.out.println("The value in Farenheit is :"+ farenheit);
	}
}
