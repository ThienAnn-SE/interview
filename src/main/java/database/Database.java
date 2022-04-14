package database;

import model.Order;

public interface Database {
    void order(String productKey);
    void insert(Double money);
}
