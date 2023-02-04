import java.util.Scanner;

public class FactorialDemo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int fact = input.nextInt();

        int factorial = 1;
        if(fact == 0){
            System.out.printf("Factorial of %d is 1 \n", fact);
        }else{
            for( int i = 1; i<= fact; ++i){
                factorial *= i ;
            }
            System.out.printf("Factorial of %d is %d \n",fact, factorial);
        }
    }
}