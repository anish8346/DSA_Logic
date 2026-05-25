// Take a 3-digit number and determine if the middle digit is the largest, smallest, or neither. 

package phase_01;

import java.util.Scanner;

public class Que_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Three digit Number : ");
        int n = sc.nextInt();
        int last = n % 10;

        n = n / 10;
        int middle = n % 10;

        n = n / 10;

        int first = n;

        if (middle > first && middle > last) {
            System.out.println("Middle digit is Largest");
        } else if (middle < first && middle < last) {
            System.out.println("Middle digit is Smallest");
        } else {
            System.out.println("Middle is Neither Largest nor Smallest");
        }
    }
}
