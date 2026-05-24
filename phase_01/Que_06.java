// Take two numbers and print the larger one 


package phase_01;
import java.util.Scanner;
public class Que_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : "  );
        int x = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int y = sc.nextInt();
        if (x > y) {
            System.out.println("Larger Number " + x);
        }
        else if (y > x) {
            System.out.println("Largest Number" + y);
        }
        else {
            System.out.println("Both are Equal ");
        }
    }
}
