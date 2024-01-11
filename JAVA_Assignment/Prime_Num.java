package Data_structures_and_algorithms.JAVA_Assignment;
import java.util.Scanner;

public class Prime_Num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");

        int num = input.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num / 2; i++) {
            // condition for nonprime
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

}
