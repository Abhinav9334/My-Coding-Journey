package studyopedia;

import java.util.Scanner;

public class Area_of_rectangle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int length, width,area;
		System.out.println("enter the length of rectangle");
		length= sc.nextInt();
		System.out.println("enter the width of rectangle");
		width= sc.nextInt();
		area = length*width;
		System.out.println("the area is : " + area);
		

	}

}


/*package studyopedia;

import java.util.Scanner;

public class Area_of_rectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length, width, area;

        System.out.println("Enter the length of the rectangle:");
        length = sc.nextInt(); // Variable length is already declared

        System.out.println("Enter the width of the rectangle:");
        width = sc.nextInt();  // Variable width is already declared

        // Correct formula for area
        area = length * width;

        System.out.println("The area is: " + area);
    }
}*/

