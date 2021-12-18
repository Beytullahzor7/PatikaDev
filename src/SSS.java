import java.util.Calendar;

public class SSS {
    public static void main(String[] args) {
        // year is stored as a static member
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println(year);

    }
}
