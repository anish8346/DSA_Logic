// Check if a given year is a leap year.

package phase_01;
import java.util.Scanner;
public class Que_05 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Year : ");
    int n = sc.nextInt();
    if (n % 4 == 0 && n%100 != 0  || n % 400 == 0) {
       System.out.println("Leap Year "); 
    }
    else {
        System.out.println("Not a Leap Year");
    }
}
}
