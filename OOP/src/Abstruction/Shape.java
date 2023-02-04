package Abstruction;

public abstract class Shape {
    double len, wid;

    Shape(double len, double wid){
        this.len = len;
        this.wid = wid;
    }

    abstract void Area();
    
}
