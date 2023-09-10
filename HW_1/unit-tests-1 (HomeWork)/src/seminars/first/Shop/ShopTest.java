package seminars.first.Shop;
import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;

import seminars.first.Calculator.Calculator;


public class ShopTest {

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */

    public static void main(String[] args){
        // Продукты в магазине:
        Product product1 = new Product();
        product1.setCost(345);
        product1.setTitle("milk");
        Product product2 = new Product();
        product2.setCost(456);
        product2.setTitle("eggs");
        Product product3 = new Product();
        product3.setCost(423);
        product3.setTitle("meat");
        Product product4 = new Product();
        product4.setCost(123);
        product4.setTitle("tea");
        Product product5 = new Product();
        product5.setCost(567);
        product5.setTitle("chocolate"); 

        // Проверка наличия продуктов и их стоимости:
        if ("meat" != product3.getTitle()){
            throw new AssertionError("Ошбика в методе");
        }
        if (567 != product5.getCost()){
            throw new AssertionError("Ошбика в методе");
        }

        // Проверка с использованием утверждений:
        assert "tea" == product4.getTitle();
        assert 345 == product1.getCost();
        assert "chocolate" == product5.getTitle();

        // Проверка с использованием утверждений AssertJ
        assertThat(product1.getCost()).isEqualTo(345);
        assertThat(product2.getCost()).isEqualTo(456);
        assertThat(product3.getTitle()).isEqualTo("meat");

        // Проверка ожидаемого исключения, с использованием утверждений AssertJ:
        Product product6 = new Product();
        assertThatThrownBy(() -> product6.setCost(-56)).isInstanceOf(IllegalStateException.class);

        // Формируем список продуктов:
        ArrayList buyList = new ArrayList<>();
        buyList.add(product1);
        buyList.add(product2);
        Shop myList = new Shop();

        System.out.println(product3.getCost());
        System.out.println(myList.getProducts());
    }
}