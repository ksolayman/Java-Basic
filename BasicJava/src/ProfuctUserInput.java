import java.util.Scanner;

// Assginment .............................. 3


public class ProfuctUserInput {
    public static void main(String[] args) {
        int id;
        String title, description, catecory;
        float price;
        
        Scanner productId = new Scanner(System.in);
        System.out.printf("Enter Product ID: ");
        id = productId.nextInt();
        System.out.printf("Product ID: %d \n", id);

        Scanner productTitle = new Scanner(System.in);
        System.out.printf("Enter Product Title: ");
        title = productTitle.nextLine();
        System.out.printf("Product Title: %s \n", title);

        Scanner productPrice = new Scanner(System.in);
        System.out.printf("Enter Product Price: ");
        price = productPrice.nextFloat();
        System.out.printf("Product Price: $%.2f \n", price);

        Scanner productDescription = new Scanner(System.in);
        System.out.printf("Enter Product Description: ");
        description = productDescription.nextLine();
        System.out.printf("Product Title: %s \n", description);

        Scanner productCategory = new Scanner(System.in);
        System.out.printf("Enter Product Category: ");
        catecory = productCategory.nextLine();
        System.out.printf("Product Category: %s \n", catecory);

    }
}
