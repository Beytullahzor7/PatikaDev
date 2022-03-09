package FolksDev;

public class _10_Heap {
    public static void main(String[] args) {

        String product = "Monster";
        String product2 = "Monster";
        String product4 = new String("Monster");

        System.out.println(product == product2); // Heap tarafında 2 degisken aynı adreste tutulur -> true
        System.out.println(product == product4); // Product4 u newleyerek yeni bir obke olusturdugumuz icin heap tarafında farklı adreste
                                                 // tutulur bu yüzden ifadenin sonucu false olur
    }
}
