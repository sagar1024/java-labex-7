import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FinancialLambda {
    public static void main(String[] args) {

        List<Stock> stockList = new ArrayList<>();

        stockList.add(new Stock("AAPL", 150.25, 100));
        stockList.add(new Stock("GOOGL", 2800.50, 50));
        stockList.add(new Stock("MSFT", 350.75, 75));
        stockList.add(new Stock("AMZN", 3200.30, 120));

        // Filtering stocks with prices greater than $2000 and sorting by price in descending order
        System.out.println("Stocks with price > $2000, sorted by price in descending order:");
        List<Stock> filteredAndSortedStocks = stockList.stream().filter(stock -> stock.getPrice() > 2000).sorted(Comparator.comparingDouble(Stock::getPrice).reversed()).collect(Collectors.toList());

        filteredAndSortedStocks.forEach(stock -> System.out.println(stock.getSymbol() + ": $" + stock.getPrice()));

        // Calculating the total value of all stocks
        double totalValue = stockList.stream().mapToDouble(Stock::getValue).sum();
        System.out.println("Total value of all stocks: $" + totalValue);

        // Calculating the stock with the highest value
        Stock highestValueStock = stockList.stream().max(Comparator.comparingDouble(Stock::getValue)).orElse(null);

        if (highestValueStock != null)
        {
            System.out.println("Stock with the highest value: " + highestValueStock.getSymbol() + " ($" + highestValueStock.getValue() + ")");
        }
    }
}
