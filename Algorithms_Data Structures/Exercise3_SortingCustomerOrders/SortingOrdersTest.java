public class SortingOrdersTest {

    public static void main(String[] args) {

        Order[] orders = {

                new Order(
                        101,
                        "Nohitha",
                        4500),

                new Order(
                        102,
                        "Priya",
                        2500),

                new Order(
                        103,
                        "Rahul",
                        7000),

                new Order(
                        104,
                        "Kiran",
                        1500),

                new Order(
                        105,
                        "Anu",
                        5000)
        };

        System.out.println(
                "===== ORIGINAL ORDERS =====");

        SortService.displayOrders(orders);

        System.out.println(
                "\n===== BUBBLE SORT =====");

        SortService.bubbleSort(orders);

        SortService.displayOrders(orders);

        Order[] quickOrders = {

                new Order(
                        101,
                        "Nohitha",
                        4500),

                new Order(
                        102,
                        "Priya",
                        2500),

                new Order(
                        103,
                        "Rahul",
                        7000),

                new Order(
                        104,
                        "Kiran",
                        1500),

                new Order(
                        105,
                        "Anu",
                        5000)
        };

        System.out.println(
                "\n===== QUICK SORT =====");

        SortService.quickSort(
                quickOrders,
                0,
                quickOrders.length - 1);

        SortService.displayOrders(
                quickOrders);
    }
}