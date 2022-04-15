package FolksDev.DataStructuresAndAlgorithms;

public class RecursiveFactorial {
    public static void main(String[] args) {
        System.out.println(recursiveFactorial(-1));
    }

    public static int recursiveFactorial(int n){
        if(n <= 1) return 1;

        return (n * recursiveFactorial(n-1));
    }
}
