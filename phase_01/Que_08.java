// Take a temperature value and print “Cold”, “Warm”, or “Hot” using range conditions.


package phase_01;
import java.util.Scanner;
public class Que_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature : ");
        int temperature = sc.nextInt();
        if (temperature < 20) {
            System.out.println("The Weather is Cold ");
        }
        else if (temperature >= 20 && temperature <= 30) {
            System.out.println("The Weather is Warm");
        }
        else {
            System.out.println("The Weather is Hot");
        }

    }
}
