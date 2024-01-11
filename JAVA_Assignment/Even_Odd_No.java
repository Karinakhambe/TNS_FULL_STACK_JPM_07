package Data_structures_and_algorithms.JAVA_Assignment;
import java.util.Scanner;

public class Even_Odd_No {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");

        int number = input.nextInt();
        // int number = 29;

        // Checking if the number is divisible by 2
        String status = number % 2 == 0 ? " is Even" : " is Odd";
        System.out.println(number + status);
    }

}
