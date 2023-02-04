public class OverloadTest {
    public static void main(String[] args) {
        OverloadTeacher th = new OverloadTeacher();
        th.displayInfo();
        System.out.println();

        OverloadTeacher th1 = new OverloadTeacher("sabuz", "male", 01);
        th1.displayInfo();
        System.out.println();

        OverloadTeacher th2 = new OverloadTeacher("sabuz", "male");
        th2.displayInfo();
        System.out.println();
    }
}
