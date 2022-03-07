package FolksDev;

public class _8_TurDonusumleri {
    public static void main(String[] args) {
        //Type Casting

        int i0 = 5;
        double d0= i0;
        System.out.println(d0);

        double d1 = 5.6;
        int i1 = (int) d1;
        System.out.println(i1);

        char ch1 = 'A';
        int i2 = ch1; //Ch1 in ascII tablosundaki karsılıgı olan 65 i bize doner
        System.out.println(i2);

        float f3 = 66f;
        char c3 = (char) f3; //ASCII tablosunda 66 char olarak B ye denk gelir
        System.out.println(c3);

        float f4 = 10.66f;
        long l1 = (long) f4;
        System.out.println(l1);

        int fahrenheit = 100;
        int celcius = (int)((fahrenheit-32) * 5.0 / 9.0);
        System.out.println(celcius);

        short s5 = 5;
        byte b5 = (byte) s5;
        System.out.println(b5);

        int f8 = 711591040;
        byte b8 = (byte) f8;
        System.out.println(b8);

        int i9 = 229179458; // 0100 0010 = 64+2 = B
        char c9 = (char) i9;
        System.out.println(c9);

        int i11 = 5;
        String str11 = String.valueOf(i11);
        String str12 = Integer.toString(i11);
        String str13 = "" + i11;

        System.out.println(str11);
        System.out.println(str12);
        System.out.println(str13);

        String str14 = "6";
        int i12 = Integer.parseInt(str14);
        int i13 = Integer.valueOf(str14);

        System.out.println(i12);
        System.out.println(i13);


    }
}
