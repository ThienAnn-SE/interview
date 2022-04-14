package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    public static final String PEPSI = "pepsi";

    public static final String COKE = "coke";

    public static final String SODA = "soda";

    private Long id;

    private String name;

    private Double price;

    private Integer quantity;

}
