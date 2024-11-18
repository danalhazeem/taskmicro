package com.example.demo.bo;

import com.example.demo.entity.StockEntity;

import java.util.List;

public class AccountResponse {
    List<StockEntity> stocks;

    public AccountResponse(List<StockEntity> stocks) {
        this.stocks = stocks;
    }

    public List<StockEntity> getStocks() {
        return stocks;
    }

    public void setStocks(List<StockEntity> stocks) {
        this.stocks = stocks;
    }
}