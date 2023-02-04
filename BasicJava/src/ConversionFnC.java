import java.util.Scanner;

public class ConversionFnC {
    public static void main(String[] args) {
        Scanner far = new Scanner(System.in);
        System.out.printf("Farenheit Reading: ");
        double fScale = far.nextDouble();

        Scanner cel = new Scanner(System.in);
        System.out.print("Celsious Reading: ");
        double cScale = cel.nextDouble();

        double farToCel = (double) (5*(fScale-32)/9);
        System.out.printf("Farenheit to Celsious: %.2f \n", farToCel);

        double celToFar = (double)((9*cScale)/5)+32;
        System.out.printf("Celsious to Farenheit: %.2f \n", celToFar);

    
    }
}