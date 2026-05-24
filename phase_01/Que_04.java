// Check if a number is divisible by both 3 and 5. 

package phase_01;
import java.util.Scanner;
public class Que_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("Number is divisible ");
        }
        else {
            System.out.println("Not Divisible ");
        }
    }
}
