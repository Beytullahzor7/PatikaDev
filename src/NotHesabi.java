import java.util.Scanner;

public class NotHesabi {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuz: ");
        matematik = input.nextInt();

        System.out.println("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.println("Turkce Notunuz: ");
        turkce = input.nextInt();

        System.out.println("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.println("Muzik Notunuz: ");
        muzik = input.nextInt();

        int[] toplam = {matematik,fizik,turkce,kimya,muzik};

        int toplama = matematik+fizik+turkce+kimya+muzik;
        int dersSayisi=5;

        for(int i=0;i<toplam.length;i++){
            if(toplam[i]<0 || toplam[i]>=100){
                toplama-=toplam[i];
                dersSayisi-=1;
                double ortalama=toplama/dersSayisi;
                System.out.println("Ortalamanız " + ortalama);
                if(ortalama>=55){
                    System.out.println("Gectiniz");
                }else{
                    System.out.println("Kaldınız!");
                }
            }
        }
    }
}
