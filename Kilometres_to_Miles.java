package studyopedia;
import java.util.Scanner;
public class Kilometres_to_Miles{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the kilometres: ");
        double Kilometre, Miles;
        Kilometre = sc.nextDouble();
        Miles = 0.621371 * Kilometre;
        System.out.println("The equivalent number of miles is: " + Miles);
    }
}
