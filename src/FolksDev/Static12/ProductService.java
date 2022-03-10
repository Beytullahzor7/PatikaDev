package FolksDev.Static12;

import java.util.Optional;

public class ProductService {
    public static void main(String[] args) {

        Product p1 = new Product(1, null);

        Optional.ofNullable(p1.name).orElseThrow(
                () -> new RuntimeException(Constant.PRODUCT_NOT_FOUND));
    }
}
