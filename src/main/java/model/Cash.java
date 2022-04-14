package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cash {
    public static final Double CASH_10000VND = 10000.00;
    public static final Double CASH_20000VND = 20000.00;
    public static final Double CASH_50000VND = 50000.00;
    public static final Double CASH_100000VND = 100000.00;
    public static final Double CASH_200000VND = 200000.00;

    public static final String KEY_10000VND = "10000";
    public static final String KEY_20000VND = "20000";
    public static final String KEY_50000VND = "50000";
    public static final String KEY_100000VND = "100000";
    public static final String KEY_200000VND = "200000";

    private Long id;

    private Double price;

    private Integer quantity;
}
