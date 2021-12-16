public class RecursiveFibonacci {
    public static void main(String[] args) {
        System.out.println(fib(4));
        // 1 1 2 3 5 8 13 21 34 55
        // f(1) = 1
        // f(1) = 1
        // f(3) = 2
        // f(4) = 3

    }
    static int fib(int n){
        if(n == 1 || n ==2){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
}
