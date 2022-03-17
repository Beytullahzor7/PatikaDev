package FolksDev.Polymorphism25;

public class Worker extends Employee{

    public Worker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.printf("Isci %s calisiyor\n", getName());
    }

    @Override
    public int calculateSalary() {
        return super.calculateSalary();
    }
}
