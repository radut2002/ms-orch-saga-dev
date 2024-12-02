package com.patroclos.inventory.dto;

import java.util.UUID;



public class ItemDTO {

    private UUID id;
    private Integer itemId;
    private Double price;
    private Integer stockAvailable;
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public Integer getItemId() {
        return itemId;
    }
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Integer getStockAvailable() {
        return stockAvailable;
    }
    public void setStockAvailable(Integer stockAvailable) {
        this.stockAvailable = stockAvailable;
    }
}
