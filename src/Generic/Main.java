package Generic;

public class Main {
    public static void main(String[] args) {
        /*Integer a = 15;
        String b = "abc";

        //Nullable<Integer> n = new Nullable<>(a);
        Nullable<String > n = new Nullable<>(b);
        n.run(); */

        Integer a = 10;
        String b = "abc";
        Double d = 2.54;
        Integer g = 15;

        Test<Integer,String,Double> t = new Test(a,b,d);
        t.setObj1(g);

        t.showInfo();
    }
}
