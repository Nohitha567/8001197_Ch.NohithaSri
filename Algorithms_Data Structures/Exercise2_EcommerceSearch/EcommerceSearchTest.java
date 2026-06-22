public class EcommerceSearchTest {

    public static void main(String[] args) {

        // Unsorted Array (Linear Search)
        Product[] productsUnsorted = {

                new Product(
                        101,
                        "Laptop",
                        "Electronics"),

                new Product(
                        102,
                        "Shoes",
                        "Fashion"),

                new Product(
                        103,
                        "Headphones",
                        "Electronics"),

                new Product(
                        104,
                        "Watch",
                        "Accessories"),

                new Product(
                        105,
                        "Camera",
                        "Electronics")
        };

        // Sorted Array (Binary Search)
        Product[] productsSorted = {

                new Product(
                        105,
                        "Camera",
                        "Electronics"),

                new Product(
                        103,
                        "Headphones",
                        "Electronics"),

                new Product(
                        101,
                        "Laptop",
                        "Electronics"),

                new Product(
                        102,
                        "Shoes",
                        "Fashion"),

                new Product(
                        104,
                        "Watch",
                        "Accessories")
        };

        System.out.println("===== LINEAR SEARCH =====");

        Product result1 =
                SearchService.linearSearch(
                        productsUnsorted,
                        "Watch");

        if (result1 != null) {

            System.out.println("Found: " + result1);

        } else {

            System.out.println("Product Not Found");
        }

        System.out.println();

        System.out.println("===== BINARY SEARCH =====");

        Product result2 =
                SearchService.binarySearch(
                        productsSorted,
                        "Headphones");

        if (result2 != null) {

            System.out.println("Found: " + result2);

        } else {

            System.out.println("Product Not Found");
        }
    }
}