import java.util.Scanner;

public class ArethmaticOparetor {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int fnum = num1.nextInt();

        Scanner num2 = new Scanner(System.in);
        System.out.print("Enter Second Number: ");
        int snum = num2.nextInt();

        float result;
        result = fnum + snum;
        System.out.printf("Add : %.2f \n", result);

        result = fnum - snum;
        System.out.printf("Sub : %.2f \n", result);

        result = fnum * snum;
        System.out.printf("Mul : %.2f \n", result);

        result = (float) fnum / snum;               //type casting
        System.out.printf("Div : %.2f \n", result);

        result = fnum % snum;
        System.out.printf("Rem : %.2f \n", result);
    }
}
