package com.sparkdev.kafka.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private int id;
    private Map<String, Double> productMap;
    private double orderAmount;
    private float tax;
    private double totalOrderAmount;
}
