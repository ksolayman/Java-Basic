import java.util.Scanner;

public class AreaDemo {
    public static void main(String[] args) {
        Scanner len = new Scanner(System.in);
        System.out.print("Enter Length: ");
        double length = len.nextDouble();

        Scanner bas = new Scanner(System.in);
        System.out.print("Enter Base: ");
        double base = bas.nextDouble();

        Scanner wid = new Scanner(System.in);
        System.out.print("Enter Width: ");
        double width = wid.nextDouble();

        Scanner rad = new Scanner(System.in);
        System.out.print("Enter Width: ");
        double radius = rad.nextDouble();
        
        
        // Area of Squre
        double areaOfSqure = (double) length*length;
        System.out.printf("Area of Squre: %.2f units \n", areaOfSqure);

        // Area of Regtangle
        double areaOfRegtangle = (double) length * width;
        System.out.printf("Area of Regtangular: %.2f units \n", areaOfRegtangle);

        // Area of Triangle
        double areaOfTriangle =  (double).5 * base * length;
        System.out.printf("Area of Triangle: %.2f units \n", areaOfTriangle);

        // Area of Circle 
        double areaOfCircle = (double) 3.1416 * radius * radius;
        System.out.printf("Area of Circle: %.2f units \n", areaOfCircle);
        
    }
}
