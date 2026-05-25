// Take three sides and check if they form a valid triangle.

package phase_01;

import java.util.Scanner;

public class Que_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the Value of b : ");
        int b = sc.nextInt();
        System.out.print("Enter the Value of c : ");
        int c = sc.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("It Form a Trianlge");
        } else {
            System.out.println("It is Not Form a triangle ");
        }
    }
}
