package database;

import model.Cash;
import model.Order;
import model.Product;
import model.PromotionHistory;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.*;

@Singleton
public class InMemoryDatabase implements Database{
    private final double PROMOTION_LIMIT = 50000.00;

    private final double INCREASE_RATE = 0.5;

    public static double money = 0;

    private double currentPromotionTotal = 0;

    private double rate = 0.1;

    private String currentPromotionProduct = "";

    private int purchaseStreak = 0;

    private Map<String, Cash> cashMap = new HashMap<>();

    private Map<String, Product> productMap = new HashMap<>();

    private List<Order> orderList = new ArrayList<>();

    private Long orderId = 0L;

    private List<PromotionHistory> promotionHistoryList = new ArrayList<>();

    private Long promotionId = 0L;

    @Inject
    public InMemoryDatabase(){
        //simulate product data
        productMap.put(Product.PEPSI, new Product(1L, Product.PEPSI, 10000.00, 50));
        productMap.put(Product.COKE, new Product(2L, Product.COKE, 10000.00, 50));
        productMap.put(Product.SODA, new Product(3L, Product.SODA, 20000.00, 50));

        //simulate cash data
        cashMap.put(Cash.KEY_10000VND,new Cash(1L, Cash.CASH_10000VND  ,200));
        cashMap.put(Cash.KEY_20000VND,new Cash(1L, Cash.CASH_20000VND  ,100));
        cashMap.put(Cash.KEY_50000VND,new Cash(1L, Cash.CASH_50000VND  ,50));
        cashMap.put(Cash.KEY_100000VND,new Cash(1L, Cash.CASH_100000VND  ,20));
        cashMap.put(Cash.KEY_200000VND,new Cash(1L, Cash.CASH_200000VND  ,10));
    }
    @Override
    public void order(String productKey) {

        Product product = productMap.get(productKey);

        if ( money < product.getPrice()){

        }
        if(product.getQuantity() < 0){

        }

        checkingPromotionProductStreak(productKey);
        releaseProduct(product);
        returnChange(product);
    }
    private void checkingPromotionProductStreak(String productKey){
        if(productKey.equalsIgnoreCase(currentPromotionProduct)) {
            purchaseStreak++;
        }else{
            purchaseStreak = 0;
        }
    }

    private void releaseProduct(Product product){
        //checking if it is 3 consecutive purchases
        if(purchaseStreak == 3){
            //reduce product quantity
            if(isWinningPromotion(product)){
                orderList.add(new Order(orderId, product.getId(), new Date()));
                product.setQuantity(product.getQuantity() - 2);
            }else{
                orderList.add(new Order(orderId++, product.getId(), new Date()));
                product.setQuantity(product.getQuantity() - 1);
                //reset streak
                purchaseStreak = 0;
            }
        }else{
            product.setQuantity(product.getQuantity() - 1);
        }
        //update product
    }

    private boolean isWinningPromotion(Product product){
        if (product.getQuantity() - 2 < 0){
            promotionHistoryList.add(new PromotionHistory(promotionId++, orderId++));
            return false;
        }
        if (currentPromotionTotal + product.getPrice() > PROMOTION_LIMIT){
            return false;
        }
        return Math.random() < rate;
    }

    private void returnChange(Product product){
    }

    @Override
    public void insert(Double money) {
        String cashKey = getCashKeyByPrice(money);

        Cash cash = cashMap.get(cashKey);
        cash.setQuantity(cash.getQuantity() + 1);

        cashMap.put(cashKey, cash);

        this.money = money;
    }

    private String getCashKeyByPrice(Double price){
        String parsedPrice = String.valueOf(price);
        switch (parsedPrice){
            case "10000.00":
                return Cash.KEY_10000VND;
            case "20000.00":
                return Cash.KEY_20000VND;
            case "50000.00":
                return Cash.KEY_50000VND;
            case "100000.00":
                return Cash.KEY_100000VND;
            case "200000.00":
                return Cash.KEY_200000VND;
            default:
                return null;
        }
    }



    //
    private void OneDayScheduledJob(){
        //if there are no promotion winning
        if(currentPromotionTotal == 0){
            rate *= INCREASE_RATE;
        }
        //reset promotion total
        currentPromotionTotal = 0;

    }
}
