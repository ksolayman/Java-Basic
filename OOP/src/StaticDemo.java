import java.net.IDN;

public class StaticDemo {
    String name; 
    int id;
    static String university = "BUBT";

    StaticDemo(String n, int i){
        name = n;
        id = i;
    }

    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("University: "+university);
    }

}
