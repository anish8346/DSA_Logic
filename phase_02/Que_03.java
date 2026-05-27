// Print all odd numbers between 1 and 100.

package phase_02;

import java.util.Scanner;

public class Que_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(" " + i);
            }
        }
    }
}
