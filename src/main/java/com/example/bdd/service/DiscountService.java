package com.example.bdd.service;

import org.springframework.stereotype.Service;

@Service
public class DiscountService {
    public String getDiscount(int amount) {
        if (amount > 5000 && amount < 10000) {
            return "10%";
        } else if (amount > 10000) {
            return "15%";
        } else {
            return "0%";
        }
    }
}
