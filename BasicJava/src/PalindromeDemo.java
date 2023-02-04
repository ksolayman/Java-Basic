
import java.util.Scanner;

public class PalindromeDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integar: ");
        int isPalindrome = input.nextInt();

        int rem, sum = 0, temp;

        temp = isPalindrome;
        while (temp != 0) {
            rem = temp%10;
            sum = sum * 10 + rem;
            temp = temp/10;
        }
       if (sum == isPalindrome) {
            System.out.printf("%d is a palindrome number.\n",isPalindrome);
        }else{
            System.out.printf("%d is not a palindrome number.\n", isPalindrome);
        }
    }
}
