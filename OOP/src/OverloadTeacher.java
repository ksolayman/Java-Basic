public class OverloadTeacher {
    String tName, tGenger;
    int tID;

    OverloadTeacher(){
        System.out.println("No Info");
    }
    OverloadTeacher(String name, String gender, int id){
        tName = name;
        tGenger = gender;
        tID = id;
    }
    OverloadTeacher(String name, String gender){
        tName = name;
        tGenger = gender;
    }

    void displayInfo(){
        System.out.println("Name: "+tName);
        System.out.println("Gender: "+tGenger);
        System.out.println("Id: "+tID);
    }
}
