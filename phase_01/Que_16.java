// Check voting eligibility for a given age (18+). 

package phase_01;

import java.util.Scanner;

public class Que_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Age : ");
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("Eligible for Vote");
        } else {
            System.out.println("Not Eligible for Vote");
        }
    }
}
