
package studyopedia;
import java.util.*;
public class Total_Salary {
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
		int hourly_wage, hours_worked , total_salary;
		System.out.println("Enter the value of hourly_wage : ");
		hourly_wage=sc.nextInt();
		System.out.println("Enter the value of hours_workred : ");
		hours_worked=sc.nextInt();
		total_salary = hourly_wage*hours_worked;
		System.out.println("The total salary of a worker is:" + total_salary);
	}	
}

