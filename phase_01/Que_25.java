// Check if a number is a multiple of 7 or ends with 7.

package phase_01;

import java.util.Scanner;

public class Que_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :  ");
        int n = sc.nextInt();

        if (n % 7 == 0 && n % 10 == 7) {
            System.out.println("The Number is Multiple of 7 and End with 7 ");
        } else {
            System.out.println("The Number is Not Multiple of 7 and End with 7 ");
        }
    }
}
