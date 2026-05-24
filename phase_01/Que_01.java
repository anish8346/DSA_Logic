
// QUE : Take a number and print whether it’s positive, negative, or zero.


package phase_01;
import java.util.Scanner;

public class Que_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("Positive");
        }
        else if (n == 0) {
            System.out.println("Zero");
        }
        else{
            System.out.println("Negative");
        }
    }
}
