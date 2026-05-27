// Take a 4-digit number and check if the first and last digits are equal.

package phase_01;

import java.util.Scanner;

public class Que_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        int last = n % 10;
        int first = n / 1000;

        if (first == last) {
            System.out.println("First and Last are Equal ");
        } else {
            System.out.println("First and last are Not Equal ");
        }
    }
}
