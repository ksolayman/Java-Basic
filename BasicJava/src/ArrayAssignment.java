import java.util.Scanner;

public class ArrayAssignment {
    public static void main(String[] args) {
        String[] weekDays = { "Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}; 

        Scanner input = new Scanner(System.in);
        System.out.print("Enter day number 1-7: ");
        int dayNaum = input.nextInt();

        if(dayNaum>= 1 && dayNaum <= 7)
            System.out.println("Today is " +weekDays[dayNaum-1]);
        else
            System.out.println("Invalid Input");
    }
}
