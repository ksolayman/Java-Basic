
// class 13
import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter Any Number: ");
        int number = input.nextInt();

        System.out.printf("Number: %d \n", number);

        System.out.println("Enter your name: ");
        Scanner inputStr = new Scanner(System.in);
        String name = inputStr.nextLine();

        System.out.printf("Name:  %s", name);

    }
}
