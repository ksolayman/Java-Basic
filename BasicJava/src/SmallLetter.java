import java.util.Scanner;

public class SmallLetter {
    public static void main(String[] args) {
        Scanner letter = new Scanner(System.in);
        System.out.print("Enter A Charecter: ");
        char ch = letter.next().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.printf("%c is small letter", ch);
        }else if (ch >= 'A' && ch <= 'Z'){
            System.out.printf("%c is capital letter", ch);
        } else{
            System.out.println("Not a Letter");
        }
    }
}
