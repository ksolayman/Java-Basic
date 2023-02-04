package Polymorphism;
public class PolySqure extends PolyShape {
    double length;

    PolySqure(double length){
        this.length = length;
    }

    @Override
    double shape() {
        // TODO Auto-generated method stub
        System.out.print("Squre: ");
        return length*length;
    }
    
}
