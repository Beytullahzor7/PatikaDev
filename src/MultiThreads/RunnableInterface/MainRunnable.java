package MultiThreads.RunnableInterface;

public class MainRunnable {
    public static void main(String[] args) {
        Counter_Runnable c1 = new Counter_Runnable("c1");
        Counter_Runnable c2 = new Counter_Runnable("c2");
        Counter_Runnable c3 = new Counter_Runnable("c3");

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);

        t1.start();
        t2.start();
        t3.start();
    }
}
