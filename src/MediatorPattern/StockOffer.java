package MediatorPattern;

/**
 * Created by hankliu on 12/4/16.
 */
public class StockOffer {
    private int stockShares = 0;
    private String stockSymbol = "";
    private int colleagueCode = 0;

    public StockOffer(int numOfShares, String stock, int colleagueCode) {
        this.stockShares = numOfShares;
        this.stockSymbol = stock;
        this.colleagueCode = colleagueCode;
    }

    public int getStockShares() {
        return stockShares;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public int getColleagueCode() {
        return colleagueCode;
    }
}
