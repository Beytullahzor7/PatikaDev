package OtherSubjects2;

public class TipDonusum {
    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println("Hello World!");
        r1.run();

        Runnable r3 = () -> {
            System.out.println("Hello World!");
        };
        r3.run();

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++){
                    System.out.println(i*2);
                }
            }
        };
        r2.run();
    }
}
