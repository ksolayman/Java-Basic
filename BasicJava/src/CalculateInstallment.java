// Assignment.......................... 4

import java.util.Scanner;

public class CalculateInstallment {
    public static void main(String[] args) {
        Scanner price = new Scanner(System.in);
        System.out.printf("Enter Phone Price: $");
        int phonePrice =price.nextInt();
       
        Scanner installNumber = new Scanner(System.in);
        System.out.printf("Enter Number of Installment: ");
        int numberOfInstallment = installNumber.nextInt();

        float installmentPerMonth = (float) (phonePrice/numberOfInstallment);
        System.out.printf("Monthly Installment: $%.2f \n", installmentPerMonth);


    }
}
