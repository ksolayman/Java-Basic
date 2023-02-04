import java.util.Scanner;

public class ArmstrongDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Positive number: ");
        int isArms = input.nextInt();

        int rem, cube, sum = 0, temp = isArms;
        while(temp != 0){
            rem = temp % 10;
            cube = rem*rem*rem;
            sum += cube;
            temp /= 10; 
        }
        if(sum == isArms)
            System.out.printf("%d is an Armstrong Number\n", isArms);
        else
            System.out.printf("%d is not an Armstrong Number\n", isArms);
    }
}