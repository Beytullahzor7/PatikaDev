package SalaryCalculator;

public class Main {
    public static void main(String[] args) {
        Employee calisan1 = new Employee("Ahmet", 2000.0,45,1985);
        calisan1.tax();
        calisan1.bonus();
        calisan1.raiseSalary();
        calisan1.printInfo();
    }
}
