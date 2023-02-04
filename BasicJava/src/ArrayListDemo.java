import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> digit = new ArrayList<Integer>();

        digit.add(0, 1);
        digit.add(1, 2);
        digit.add(2, 3);
        digit.add(3, 4);

        // System.out.println(digit);

        for (Integer digi : digit) {
            System.out.print("Array L ist: "+digi);
        }
        System.out.println();
        digit.remove(2);
        System.out.println(digit);
        System.out.println("Array Size: "+digit.size());
    }
}
