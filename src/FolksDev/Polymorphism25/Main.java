package FolksDev.Polymorphism25;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Engineer("Beytullah", true);
        Employee w1 = new Worker("Ahmet");

//        e1.work();
//        System.out.println(e1.calculateSalary());
//        w1.work();
//        System.out.println(w1.calculateSalary());

        writeSalary(e1);
        writeSalary(w1);

        Employee e2 = new Engineer("Mehmet", true);
        ((Engineer) e2).isRemote(); //downcasting

        Engineer e3 = new Engineer("Veli", true);
        e3.isRemote();

        work(new Engineer("Merve",false));
    }

    public static void writeSalary(Employee employee){
        System.out.println(employee.calculateSalary());
    }

    public static void work(Employee employee){
        employee.work();
    }
}
