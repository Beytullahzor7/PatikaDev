public class IfElse {
    public static void main(String[] args) {
        int age=25;
        int weight=48;

        if(age>=18){
            if(weight>=48){
                System.out.println("Kan verebilirsiniz");
            }
            else{
                System.out.println("Kan veremezsiniz");
            }
        }
        else{
            System.out.println("Kan verebilmek için yaşınız 18'den büyük olmalıdır.");
        }
    }
}
