// Take two numbers and determine whether both are even, both are odd, or one is even and one is odd.

package phase_01;

import java.util.Scanner;

public class Que_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int b = sc.nextInt();

        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println("Both are Even ");
        } else if (a % 2 != 0 && b % 2 != 0) {
            System.out.println("Both are Odd ");
        } else {
            System.out.println("One is Even and One is Odd ");
        }
    }
}
