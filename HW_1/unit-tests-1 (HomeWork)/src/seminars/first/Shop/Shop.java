package seminars.first.Shop;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//import java.util.Collections.sort();

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
//        Collections.sort(products);
        // Допишите реализацию метода самостоятельно
        return products;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        // Допишите реализацию метода самостоятельно
        return null;
    }

}