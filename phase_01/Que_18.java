// Take an alphabet character and check if it lies between ‘a’ and ‘m’ or ‘n’ and ‘z’.

package phase_01;

import java.util.Scanner;

public class Que_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Character : ");
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'm') {
            System.out.println("It is lies between a and m");
        } else if (ch >= 'n' && ch <= 'z') {
            System.out.println("It is lies between n and z");
        } else {
            System.out.println("Invalid Input");
        }
    }
}
