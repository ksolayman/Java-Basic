package Abstruction;

public class ShapeRectangle extends Shape{
    
    ShapeRectangle(double x, double y){
       super(x, y);
    }

    @Override
    void Area(){
        double area = (0.5*len*wid);
        System.out.println("Rectangle: "+area);
    }
}
