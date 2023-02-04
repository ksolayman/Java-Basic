package Inheritance;
public class InheritanceTeacher extends InheritancePerson {
    String designation;

    void displayinfo(){
        display();
        System.out.println("Designation: "+designation);
    }


    public static void main(String[] args) {
        InheritanceTeacher tch = new InheritanceTeacher();
        tch.name = "sabuz";
        tch.age = 27;
        tch.designation = "Tester";

        tch.displayinfo();
    }
}
