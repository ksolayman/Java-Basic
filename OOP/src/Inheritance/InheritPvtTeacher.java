package Inheritance;
public class InheritPvtTeacher extends InheritPvtPerson {
    
    private String qualification;

    public void setQuali(String qualification){
        this.qualification = qualification;
    }
    public String getQuali(){
        return qualification;
    }

    @Override                 // method overriding
    void display(){
        System.out.println("name: "+getName());
        System.out.println("age: "+getAge());
        System.out.println("qualification: "+getQuali());
    }

    public static void main(String[] args) {
        InheritPvtTeacher itch = new InheritPvtTeacher();
        itch.setName("sabuz");
        itch.setAge(27);
        itch.setQuali("Tester");

        itch.display();;
        
    }
}
