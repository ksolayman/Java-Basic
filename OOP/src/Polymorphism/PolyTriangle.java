package Polymorphism;
public class PolyTriangle extends PolyShape {

    double base, length;

    PolyTriangle(double base, double length){
        this.base  = base;
        this.length = length;
    }

    @Override
    double shape() {
        // TODO Auto-generated method stub
        System.out.print("Triangle: ");
        return (0.5 * base * length);
    }

    public static void main(String[] args) {
    // overriding super class shape method
        // PolyShape s = new PolyShape();
        // PolySqure sq = new PolySqure(10);
        // PolyTriangle t = new PolyTriangle(10, 20);

        // System.out.println(s.shape());
        // System.out.println(sq.shape());
        // System.out.println(t.shape());

    // dynamic method despatch
        //  PolyShape s = new PolyShape();
        //  PolyShape sq = new PolySqure(10);
        //  PolyShape st = new PolyTriangle(10, 20);
        
        //  System.out.println(s.shape());
        //  System.out.println(sq.shape());
        //  System.out.println(st.shape());

    // we can use array......
          PolyShape[] s = new PolyShape[3];

          s[0] = new PolyShape();
          s[1] = new PolySqure(10);
          s[2] = new PolyTriangle(10, 20);

          for(int i = 0; i < 3; i++){
            System.out.println(s[i].shape());
          }
    }
    
}
