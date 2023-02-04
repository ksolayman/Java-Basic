package Abstruction;

public class AbsTest {
    
    public static void main(String[] args) {
        AbsUser message;

        message = new AbsKarim();
        message.mobileUser();

        message = new AbsRahim();
        message.mobileUser();
    }
}
