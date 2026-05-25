// Take marks (0–100) and print the corresponding grade (A/B/C/D/F)

package phase_01;

import java.util.Scanner;

public class Que_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Marks : ");
        int marks = sc.nextInt();
        if (marks >= 90) {
            System.out.print("Grade is A ");
        } else if (marks >= 80) {
            System.out.print("Grade is B ");
        } else if (marks >= 70) {
            System.out.print("Grade is C ");
        } else if (marks >= 60) {
            System.out.print("Grade is D ");
        } else if (marks >= 50) {
            System.out.print("Grade is E ");
        } else {
            System.out.print("Grade is F ");
        }
    }
}
