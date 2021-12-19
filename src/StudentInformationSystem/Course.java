package StudentInformationSystem;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozluNote;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int sozluNote = 0;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)) {
            this.teacher = teacher; //dışarıdan aldıgımız teacher nesnesini içerideki teacher nesnesine eşitliyoruz.
            System.out.println(teacher.name+ " " + teacher.branch + " dersine atandı.");
        }else{
            System.out.println("Öğretmen ve dersler uyusmuyor");
        }
    }

    void printTeacherInfo(){
        this.teacher.printInformation();
    }
}
