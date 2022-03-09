package FolksDev;

public class _11_Category {

    String categoryName;

    public _11_Category(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return categoryName;
    }

    public static void main(String[] args) {
        _11_Category category = new _11_Category("HOUSE");
        _11_Category category1 = new _11_Category("GARDEN");

        System.out.println(category); //HOUSE
        System.out.println(category1); //GARDEN

        change(category, category1);

        System.out.println(category);
        System.out.println(category1);
    }

    private static void change(_11_Category category, _11_Category category1){
        _11_Category value = category;
        category = category1;
        category1 = value;

        System.out.println(category);
        System.out.println(category1);
    }
}
