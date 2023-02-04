import java.util.Scanner;

import javax.security.sasl.SaslException;

public class ReverseDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Positive Integer: ");
        int isReverse = input.nextInt();

        int temp = isReverse, rem, sum= 0;
        while(temp != 0){
            rem = temp % 10;
            sum = sum * 10 + rem;
            temp /= 10; 
        }
        System.out.printf("Reverse of %d is : %d \n", isReverse, sum);
    }
}
