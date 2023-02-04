public class Box {
    double height;
    double width;
    double depth;

    Box(double h, double w, double d){
        height = h;
        width = w;
        depth = d;
    }

    void DisplayVol(){
        Double Vol = height * width * depth;
        System.out.println("Volume of box: "+ Vol);
    }

    public static void main(String[] args) {
        Box box1 = new Box(10,10,10);
        box1.DisplayVol();

        System.out.println();

        Box box2 = new Box(20,30, 10);
        box2.DisplayVol();
    }

}
