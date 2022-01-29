package MultiThreads.RaceCondition;

public class Order implements Runnable{
    private int orderNo;
    private final Object LOCK = new Object();

    public Order() {
        this.orderNo = 0;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        increaseOrder();
    }

    /* Senkronizasyon 1. YOL
    synchronized (LOCK){
        this.orderNo++;
        System.out.println(Thread.currentThread().getName() + " -orderNo => " + this.orderNo);
    }
    */



    public synchronized void increaseOrder(){ //Senkronizasyon 2. yol
        this.orderNo++;
        System.out.println(Thread.currentThread().getName() + " -orderNo => " + this.orderNo);
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }
}
