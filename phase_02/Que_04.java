package phase_02;

import java.util.Scanner;

public class Que_04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Ending Number : ");
        int n = sc.nextInt();

        for (int i = 10; i >= n; i--) {
            System.out.println(i);
        }

    }
}