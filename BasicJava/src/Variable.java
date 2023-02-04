public class Variable {
    public static void main(String[] args) {
        boolean b = true;     //dynamic initialization
        int i = 10;
        char c = 'a';
        double d = 22.334;
        float f = 10.5f; 
        String s = "solayman";

        // System.out.println("b: "+b);
        // System.out.println("i: "+i);
        // System.out.println("c: "+c );
        // System.out.println("d: "+d);
        // System.out.println("f: "+f);
        // System.out.println("s: "+s);

        // formet specifier...... use printf other wise error

        System.out.printf("b: %b \n", b);
        System.out.printf("i: %d \n", i);
        System.out.printf("s: %s \n", s);
        System.out.printf("f: %.3f \n", f);
        System.out.printf("c: %c \n",c);
        System.out.printf("d: %.2f \n", d);
        
    }
}
