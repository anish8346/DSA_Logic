// Take a 3-digit number and check if all digits are distinct. 

package phase_01;

import java.util.Scanner;

public class Que_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Three Digit Number : ");
        int num = sc.nextInt();
        int last = num % 10;
        num = num / 10;

        int middle = num % 10;
        num = num / 10;

        int first = num;

        if (first != middle && first != last && middle != last) {
            System.out.println("All digits are Distinct");
        } else {
            System.out.println("Digit are not Distinct");
        }
    }
}
