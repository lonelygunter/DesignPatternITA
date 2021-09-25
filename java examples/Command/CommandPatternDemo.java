package Command;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock stock = new Stock("prodotti", 10);

        BuyStock buyStock  = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(sellStock);
        broker.takeOrder(buyStock);
        

        broker.placeOrder();
    }
}
