public class Boxing_Unboxing {
    public static void main(String[] args) {

        int a = 5;

        //Autoboxing
        Integer b = a;

        //Boxing
        Integer c = Integer.valueOf(a);

        //AutoUnboxing
        int d = c;

        //Unboxing
        int i = c.intValue();
    }
}
