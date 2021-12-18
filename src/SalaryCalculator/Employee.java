package SalaryCalculator;

import java.util.Calendar;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    int bonus;
    double total;
    double raise;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.total = this.salary;
        this.raise = 0; //default
        this.bonus = 0;
        this.tax   = 0;
    }

    public void tax(){
        if(this.salary < 1000){
            //System.out.println("Maasınız 1000 liradan az oldugu için vergi alınmayacaktır");
            this.tax = 0;
        }
        if(this.salary >= 1000){
            //System.out.println("Maasınız 1000 liradan fazla oldugu için %3 oranında vergi alınacaktır");
            double tax1 = this.salary * 0.03;
            //System.out.println("Kesilecek vergi tutarı: " + tax1);
            this.tax = tax1;
            this.total-= this.tax;
        }
    }
    public void bonus(){
        if(workHours >= 40){
            int extraHours = this.workHours - 40;
            int extraBonus = 30 * extraHours;
            //System.out.println("Extra mesai ücreti: " + extraBonus);
            this.bonus = extraBonus;
            this.total += this.bonus;
        }
    }
    public void raiseSalary(){
        int now = Calendar.getInstance().get(Calendar.YEAR);
        int time = now-hireYear;
        if(time < 10){
            this.raise = (this.salary*0.05);
            //System.out.println("Maasınıza %5 oranında zam yapıldı " + this.raise);
            this.total+=this.raise;
        }
        if(time > 9 && time < 20){
            this.raise = (this.salary*0.1);
            //System.out.println("Maasınıza %10 oranında zam yapıldı" + this.raise);
            this.total+=this.raise;
        }
        if(time > 19){
            this.raise = this.salary*0.15;
            //System.out.println("Maasınıza %15 oranında zam yapıldı: " + this.raise);
            this.total+=this.raise;
        }
    }

    void printInfo() {
        System.out.println("Adı :" + this.name);
        System.out.println("Maaşı :" + this.salary);
        System.out.println("Çalışma Saati :" + this.workHours);
        System.out.println("Başlangıç yılı :" + this.hireYear);
        System.out.println("Vergi :" + this.tax);
        System.out.println("Bonus :" + this.bonus);
        System.out.println("Maaş artışı :"+ this.raise);
        System.out.println("Vergi ve bonuslarla birlikte maaş :" + (this.salary-this.tax+this.bonus));
        System.out.println("Toplam maaş :"+this.total);
    }

}
