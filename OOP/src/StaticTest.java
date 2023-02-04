public class StaticTest {
    public static void main(String[] args) {
        StaticDemo student = new StaticDemo("zh", 25);
        student.displayInfo();
        
        System.out.println();
        
        StaticDemo std = new StaticDemo("sk", 35);
        std.displayInfo();
    }
}
 