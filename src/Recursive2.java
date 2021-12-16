public class Recursive2 {
    public static void main(String[] args) {
        System.out.println(toplam(5));

    }
    public static int toplam(int n){
        if(n > 0){
            return toplam(n-1) + n;
        }else{
            return 0;
        }

    }
}
