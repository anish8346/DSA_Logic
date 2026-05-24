// Check if a number is divisible by 5.


package phase_01;
import java.util.Scanner;
public class Que_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        if (n % 5 == 0) {
            System.out.println("Number is divisible by 5");
        }
        else {
            System.out.println("Number is Not Divisible by 5");
        }
    }
}
