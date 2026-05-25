// Check if one of two given numbers is a multiple of the other

package phase_01;

import java.util.Scanner;

public class Que_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("It is a Multiple of the Other Two Numbers");
        } else {
            System.out.println("It  is not the Multiple of the other Two Numbers ");
        }
    }
}
