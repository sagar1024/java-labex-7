public class Stock {

    private String symbol;
    private double price;
    private int quantity;

    public Stock(String symbol, double price, int quantity) {
        this.symbol = symbol;
        this.price = price;
        this.quantity = quantity;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getValue() {
        return price * quantity;
    }
}
