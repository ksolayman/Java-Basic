package Abstruction;

public class ShapeCircle extends Shape {

    ShapeCircle(double x){
        super(x, x);
    }
    void Area(){
        double area = 3.1416*len*len;
        System.out.println("Circle: "+area);
    }
    
}
