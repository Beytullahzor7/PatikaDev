package OtherSubjects2.Lambda;

public class Main {
    public static void main(String[] args) {
        Math sum = new Math() {
            @Override
            public int transaction(int a, int b) {
                return a+b;
            }
        };
        System.out.println(sum.transaction(5,6));

        Math sum2 = (a,b) -> a + b;
        System.out.println(sum2.transaction(5,6));

        Math multiply = (a,b) -> a * b;
        System.out.println(multiply.transaction(2,3));

        Math division = (a,b) -> {
            if(b == 0){
                b=1;
            }
            return a / b;
        };
        System.out.println(division.transaction(4,0));

    }
}
