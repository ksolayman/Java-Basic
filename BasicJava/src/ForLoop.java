// Assignment ..................... 10

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner start = new Scanner(System.in);
        System.out.printf("Start Point: ");
        int initialPoint = start.nextInt();

        Scanner end = new Scanner(System.in);
        System.out.printf("End Point: ");
        int exePoint = end.nextInt();  
        
        int i, sum = 0;
        for(i = initialPoint; i <= exePoint; i++){
            sum += i;
        }
        System.out.printf("Sum Result: %d \n", sum);
    }
}
