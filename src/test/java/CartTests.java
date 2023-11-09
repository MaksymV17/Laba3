import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CartTest {

    @Test
    public void testAddToCart() {
        // Створюємо мок-об'єкт класу Product
        Product product = mock(Product.class);

        // Створюємо об'єкт класу Cart
        Cart cart = new Cart();

        // Мокуємо метод getId() для об'єкта product
        when(product.getId()).thenReturn(1);

        // Додаємо мок-продукт до кошика
        cart.addToCart(product);

        // Перевіряємо, чи продукт був доданий до кошика
        assertTrue(cart.getProducts().contains(product));
    }

    @Test
    public void testRemoveFromCart() {
        // Створюємо мок-об'єкт класу Product
        Product product = mock(Product.class);

        // Створюємо об'єкт класу Cart
        Cart cart = new Cart();

        // Мокуємо метод getId() для об'єкта product
        when(product.getId()).thenReturn(1);

        // Додаємо мок-продукт до кошика
        cart.addToCart(product);

        // Видаляємо мок-продукт з кошика
        cart.removeFromCart(product);

        // Перевіряємо, чи продукт був видалений з кошика
        assertFalse(cart.getProducts().contains(product));
    }

    @Test
    public void testClearCart() {
        // Створюємо мок-об'єкт класу Product
        Product product = mock(Product.class);

        // Створюємо об'єкт класу Cart
        Cart cart = new Cart();

        // Мокуємо метод getId() для об'єкта product
        when(product.getId()).thenReturn(1);

        // Додаємо мок-продукт до кошика
        cart.addToCart(product);

        // Очищаємо кошик
        cart.clearCart();

        // Перевіряємо, чи кошик пустий
        assertTrue(cart.getProducts().isEmpty());
    }

    @Test
    public void testGetProducts() {
        // Створюємо об'єкт класу Cart
        Cart cart = new Cart();

        // Створюємо мок-об'єкти класу Product
        Product product1 = mock(Product.class);
        Product product2 = mock(Product.class);

        // Мокуємо метод getId() для об'єктів product1 і product2
        when(product1.getId()).thenReturn(1);
        when(product2.getId()).thenReturn(2);

        // Додаємо мок-продукти до кошика
        cart.addToCart(product1);
        cart.addToCart(product2);

        // Отримуємо список продуктів з кошика
        List<Product> products = cart.getProducts();

        // Перевіряємо, чи список містить всі додані продукти
        assertTrue(products.contains(product1));
        assertTrue(products.contains(product2));
    }
}
