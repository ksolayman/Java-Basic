import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer number: ");
        int isPrime = input.nextInt();

        if(isPrime == 0 || isPrime == 1)
            System.out.println(isPrime +" is not prime number");
        else{
            int flag = 0;
            for(int i = 2; i < isPrime/2; i++){
                if(isPrime % 2 == 0){
                    flag++;
                    break;
                }
            }
            if(flag == 0)
                System.out.println(isPrime+" is a prime number");
            else
                System.out.println(isPrime+" is a not prime number");
        }
    }
}