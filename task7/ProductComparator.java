package task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductComparator {

    public static void productSort(List<Product> productList)
    {
        Collections.sort(productList);
        for (Product product:productList) {
            System.out.println(product);
        }
    }
    public static void main(String[] args) {
        Product p1 = new Product("HP", 12000);
        Product p2 = new Product("Lenovo", 21010);
        Product p3 = new Product("HP", 17005);
        Product p4 = new Product("Mac", 56006);

        List<Product> productList = new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);

        productSort(productList);

    }
}
