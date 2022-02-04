public class Recursive4 {
    public static void main(String[] args) {
        System.out.println(as(3));

    }
    static int as(int i) {
        if (i < 2) return 1;
        else return (i * as(i - 1));
    }
}
