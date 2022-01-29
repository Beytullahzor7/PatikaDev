package MultiThreads.RaceCondition;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Order o1 = new Order();
        List<Thread> islemler = new ArrayList<>();

        for(int i=0; i<100; i++){
            Thread t1 = new Thread(o1);
            islemler.add(t1);
            t1.start();
        }

        for(Thread t : islemler){
            t.join(); //join ile threadlerin birbirinden bagımsız olmasını sagladık
        }

        System.out.println(o1.getOrderNo()); //Kontrol için son elemanı aldık
    }
}
