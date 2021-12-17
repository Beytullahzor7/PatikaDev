package InformationSystem;

public class Teacher {
    String name;
    String mpno;
    String branch;

    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void printInformation(){
        System.out.println("Adı: " + this.name);
        System.out.println("Telefonu: " +this.mpno);
        System.out.println("Brans: " + this.branch);
    }
}
