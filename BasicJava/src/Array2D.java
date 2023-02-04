import java.util.Scanner;

public class Array2D {

    public static void main(String[] args) {
        int[][] Array2D = new int[4][5];

        Scanner input = new Scanner(System.in);
        for(int r = 0; r < 4; r++ ){
            for(int c = 0; c < 5; c++ ){
                System.out.printf("Array: [%d] [%d]: ",r,c);
                Array2D[r][c] = input.nextInt();
            }
        }

        System.out.println("\n2D Array = \t");
        for(int r = 0; r < 4; r++ ){
            for(int c = 0; c < 5; c++ ){
                System.out.print(" "+Array2D[r][c]);
            }
            System.out.println("\n");
        }

    }
}
