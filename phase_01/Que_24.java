// Check whether a given integer is single-digit, double-digit, or multi-digit.

package phase_01;

import java.util.Scanner;

public class Que_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        n = Math.abs(n);
        if (n <= 9) {
            System.out.println("The Given Integer is Single Digit ");
        } else if (n <= 99) {
            System.out.println("The Given Integer is Double Digit ");
        } else {
            System.out.println("The Give Integer is Multi Digit ");
        }
    }
}
