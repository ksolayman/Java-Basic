package Encapsulation;
public class EncapPerson {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;       
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;       
    }

    public static void main(String[] args) {
        EncapPerson ob = new EncapPerson();
        ob.name = "sabuz";
        ob.age = 27;

        System.out.println("Name: "+ob.getName());
        System.out.println("Age: "+ob.getAge());
    }

}
