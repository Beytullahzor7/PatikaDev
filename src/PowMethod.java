public class PowMethod {
    public static void main(String[] args) {
         int pow = power(3,4);
        System.out.println(pow);

        System.out.println(power(4,3));
        helloWorld();

    }

    public static int power(int base, int exp){
        int result = 1;
        for(int i=1; i<=exp; i++){
            result*=base;
        }
        return result;
    }
    public static void helloWorld(){
        System.out.println("Hello World!");
    }
}
