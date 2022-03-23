package EmailAdministrationApplication;

public class EmailApp {
    public static void main(String[] args) {
        Email email1 = new Email("Beytullah", "Zor");

        email1.setAlternateEmail("java@gmail.com");
        System.out.println(email1.getAlternateEmail());
        System.out.println(email1.toString());
    }
}
