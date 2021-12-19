package StudentInformationSystem;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;
    double soz;
    double finalNote1;
    double finalNote2;
    double finalNote3;

    public Student(String name, String stuNo, String classes,Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
        this.soz = 0.0;
        this.finalNote1 = 0.0;
        this.finalNote2 = 0.0;
        this.finalNote3 = 0.0;
    }

    void addBulkExamNote(int note1, int noteSoz1, int note2, int noteSoz2, int note3, int noteSoz3){
        if((note1 >= 0 && note1 <= 100) && (noteSoz1 >= 0 && noteSoz1 <= 100)){
            this.c1.note = note1;
            this.c1.sozluNote = noteSoz1;
        }

        if((note2 >= 0 && note2 <= 100) && (noteSoz2 >= 0 && noteSoz2 <= 100)){
            this.c2.note = note2;
            this.c2.sozluNote = noteSoz2;
        }

        if((note3 >= 0 && note3 <= 100) && (noteSoz3 >= 0 && noteSoz3 <= 100)){
            this.c3.note = note3;
            this.c3.sozluNote = noteSoz3;
        }
    }
    void calculateNote(){
        this.finalNote1 = (this.c1.note * 0.8)+(this.c1.sozluNote * 0.2);
        this.finalNote2 = (this.c2.note * 0.8)+(this.c2.sozluNote * 0.2);
        this.finalNote3 = (this.c3.note * 0.8)+(this.c3.sozluNote * 0.2);
    }

    void isPass(){
        calculateNote();
        System.out.println("-----------------");
        this.average = (this.finalNote1 + this.finalNote2 + this.finalNote3) / 3.0;
        if(this.average >= 55){
            System.out.println("Dersi Geçtiniz.");
            this.isPass = true;
        }else{
            System.out.println("Kaldınız...");
            this.isPass = false;
        }
        printNote();
    }

    void printNote(){
        System.out.println( this.c1.name + " Notu\t: " +  this.finalNote1);
        System.out.println( this.c2.name + " Notu\t: " +  this.finalNote2);
        System.out.println( this.c3.name + " Notu\t: " +  this.finalNote3);
        System.out.println("Ortalamanız: " + this.average);
    }
}
