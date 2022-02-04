public class RecursiveFactorial {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
    public static int factorial(int number){
        if(number < 2)
            return 1;
        else
            return (number * factorial(number-1));
    }
}
