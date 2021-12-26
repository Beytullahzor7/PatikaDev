package EmployeeManagement;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("ali","0543","ali@gmail.com");

        Akademisyen a = new Akademisyen("Ahmet","0540","ahmet@gmail.com","eem","prof");
        a.derseGir();

        Asistan b = new Asistan("abc","0","x","s","s","45");
        b.quizYap();

    }
}
