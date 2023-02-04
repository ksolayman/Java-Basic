package Abstruction;

public class ShapeTest {
    public static void main(String[] args) {
        Shape sp;

        sp = new ShapeRectangle(10, 20);
        sp.Area();

        sp = new ShapeCircle(10);
        sp.Area();

    }    
}
