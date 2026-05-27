// Print numbers from 1 to 10. 

package phase_02;

import java.util.Scanner;

public class Que_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(" " + i);
        }
    }
}
