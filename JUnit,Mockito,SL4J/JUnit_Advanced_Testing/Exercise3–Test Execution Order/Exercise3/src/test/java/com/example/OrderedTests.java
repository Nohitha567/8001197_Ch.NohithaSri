import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {

    @Test
    @Order(1)
    void testLogin() {

        System.out.println("Step 1: User Login");

    }

    @Test
    @Order(2)
    void testSearchProduct() {

        System.out.println("Step 2: Search Product");

    }

    @Test
    @Order(3)
    void testAddToCart() {

        System.out.println("Step 3: Add Product to Cart");

    }

    @Test
    @Order(4)
    void testCheckout() {

        System.out.println("Step 4: Checkout");

    }
}