// Assignment ........................... 8
import java.util.Scanner;

public class LogicalAssignment {

    public static void main(String[] args) {
        Scanner masters = new Scanner(System.in);
        System.out.println("Are you complete your Master's? y/n");
        char edu = masters.next().charAt(0);

        Scanner fluent = new Scanner(System.in);
        System.out.println("Are you fluent in english? y/n");
        char eng = fluent.next().charAt(0);

        if(edu == 'y' && eng == 'y' || edu == 'Y' && eng == 'Y'|| edu == 'Y' && eng == 'y' || edu == 'y' && eng == 'Y'){
            System.out.println("You are elegible for job interview");
        }else{
            System.out.println("You are not elegible for job interview");
        }

    }
}