public class Teacher {
    String teacherName, teacherGender, teacherSubject;
    int teacherAge, teacherPhone;

    Teacher(String name, String gender, int age, int phone, String subject){
        teacherName = name;
        teacherGender = gender;
        teacherAge = age;
        teacherPhone = phone;
        teacherSubject = subject;
    }

    void desplayInfo(){
        System.out.printf("Name: %s\n",teacherName);
        System.out.printf("Gender: %s\n",teacherGender);
        System.out.printf("Age: %d\n",teacherAge);
        System.out.printf("Phone: %d\n",teacherPhone);
        System.out.printf("Name: %s\n",teacherSubject);
        System.out.println("\n");

    }
}
