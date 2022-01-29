package MultiThreads.RunnableInterface;

public class Counter_Runnable implements Runnable {
    private String name;

    public Counter_Runnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " sayaci basladı");

        for(int i=0; i<10; i++){
            System.out.println(this.getName() + " : " + i );
        }
    }

    @Override
    public String toString() {
        return "Counter_Runnable{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
