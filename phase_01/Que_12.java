// If the sides form a valid triangle, determine whether it is equilateral, isosceles, or scalene.

package phase_01;

import java.util.Scanner;

public class Que_12 {
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
        if (a == b && b == c) {
            System.out.print("It is Equilateral Triangle : ");
        } else if (a == b || b == c || a == c) {
            System.out.print("It is and Isoceles Triangle : ");
        } else if (a != b && b != c && a != c) {
            System.out.println("It is Scalene Triangle : ");
        } else {
            System.out.println("Invalid Triangle");
        }
    }
}
