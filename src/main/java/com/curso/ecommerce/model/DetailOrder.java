package com.curso.ecommerce.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DetailOrder {

    private Long id;
    private String name;
    private int amount;
    private double price;
    private double total;

    @Override
    public String toString() {
        return "DetailOrder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                ", total=" + total +
                '}';
    }
}
