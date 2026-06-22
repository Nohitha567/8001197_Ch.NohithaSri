public class InventoryManagementTest {

    public static void main(String[] args) {

        InventoryManager manager =
                new InventoryManager();

        Product p1 =
                new Product(
                        101,
                        "Laptop",
                        20,
                        65000
                );

        Product p2 =
                new Product(
                        102,
                        "Mouse",
                        50,
                        500
                );

        Product p3 =
                new Product(
                        103,
                        "Keyboard",
                        30,
                        1200
                );

        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);

        manager.displayProducts();

        System.out.println();

        manager.updateProduct(
                102,
                60,
                550
        );

        manager.displayProducts();

        System.out.println();

        manager.deleteProduct(103);

        manager.displayProducts();
    }
}