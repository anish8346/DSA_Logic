// Print the sum of all odd numbers up to n. 

package phase_02;

import java.util.Scanner;

public class Que_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                System.out.print(" " + i);
            }
        }
    }
}
