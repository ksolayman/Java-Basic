import java.util.Scanner;

public class SumOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enyter two numbers: ");
        int start = input.nextInt();
        int end = input.nextInt();

        int sumOdd = 0;
        for(int i = start; i <= end; i++ ){
            if(i%2 == 1)
                sumOdd += i;
        }
        System.out.printf("Sum of Odd Numbers: %d \n", sumOdd);
    }
}