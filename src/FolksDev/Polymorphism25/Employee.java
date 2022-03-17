package FolksDev.Polymorphism25;

public class Employee {

    public static final int MIN_WAGE = 4250;
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void work(){
        System.out.printf("%s calisiyor\n", this.name);
    }

    public int calculateSalary(){
        return MIN_WAGE;
    }
}
