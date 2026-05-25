// Take the hour of the day (0–23) and print “Good Morning”, “Good Afternoon”, “Good Evening”, or “Good Night”

package phase_01;

import java.util.Scanner;

public class Que_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Time : ");
        int hour = sc.nextInt();
        if (hour >= 5 && hour <= 11) {
            System.out.println("Good Morning ");
        } else if (hour >= 12 && hour <= 16) {
            System.out.println("Good AfterNoon");
        } else if (hour >= 17 && hour <= 20) {
            System.out.println("Good Evening");
        } else if (hour >= 21 || hour <= 4) {
            System.out.println("Good Night ");
        } else {
            System.out.println("Invalid Input ");
        }
    }
}
