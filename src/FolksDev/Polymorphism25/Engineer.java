package FolksDev.Polymorphism25;

public class Engineer extends Employee{

    protected boolean isRemote;

    public Engineer(String name, boolean isRemote) {
        super(name);
        this.isRemote = isRemote;
    }

    @Override
    public void work() {
        System.out.printf("Muhendis %s calisiyor\n", getName());
    }

    @Override
    public int calculateSalary() {
        return super.calculateSalary() + 3000;
    }

    public void isRemote(){
        if(isRemote)
            System.out.printf("Muhendis %s uzaktan calisiyor\n", getName());
        else
            System.out.printf("Muhendis %s ofiste calisiyor\n", getName());
    }
}
