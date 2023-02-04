public class VarLenArguments {
    void addDemo( int ... number){
        double sum = 0;
        for (int i : number) {
            sum += i;
        }
        System.out.println("Sum: "+sum);
    }
    
    public static void main(String[] args) {
        VarLenArguments ob = new VarLenArguments();
        ob.addDemo(10,20);
        ob.addDemo(10,20,30);
        ob.addDemo(10,20,30,40);
    }
}
