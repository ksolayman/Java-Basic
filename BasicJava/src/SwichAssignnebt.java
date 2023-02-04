import java.util.Scanner;

public class SwichAssignnebt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a digit: ");
        int digit = input.nextInt();

        switch (digit) {
            case 1:
                System.out.println("Language Bengali");
                break;

                case 2:
                System.out.println("Language Hindi");
                break;

                case 3:
                System.out.println("Language Urdu");
                break;

            default:
                System.out.println("Language English");
                break;
        }
    }
}
