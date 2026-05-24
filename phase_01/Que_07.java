//  Take three numbers and print the largest.


package phase_01;
import java.util.Scanner;
public class Que_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int b = sc.nextInt();
        System.out.print("Enter the Third Number : ");
        int c = sc.nextInt();

        if (a>b && a > c) {
            System.out.println(a);
        }
        else if (b > a && b > c) {
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }
    }
}
