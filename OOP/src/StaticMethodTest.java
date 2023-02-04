public class StaticMethodTest {
    public static void main(String[] args) {
        StaticMethod stat = new StaticMethod();
        stat.display1();
        System.out.println();

        StaticMethod.display2();
    }
}
