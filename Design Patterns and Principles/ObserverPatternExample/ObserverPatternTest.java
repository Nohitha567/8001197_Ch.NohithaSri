public class ObserverPatternTest {

    public static void main(String[] args) {

        StockMarket stockMarket =
                new StockMarket();

        Observer mobileUser =
                new MobileApp("Nohitha");

        Observer webUser =
                new WebApp("Admin");

        stockMarket.registerObserver(mobileUser);
        stockMarket.registerObserver(webUser);

        System.out.println("Stock Price Changed:");

        stockMarket.setStock("TCS", 4250);

        System.out.println();

        stockMarket.setStock("Infosys", 1850);
    }
}