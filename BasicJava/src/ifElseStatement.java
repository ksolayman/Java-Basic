// Assignment ............................... 5

import java.util.Scanner;

public class ifElseStatement {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        System.out.print("Enter Votar Age: ");
        int votarAge = age.nextInt();

        if(votarAge>= 18){
            System.out.println("Valid Voter");
        }else{
            System.out.println("Invalid Votar");
        }
    }
}
