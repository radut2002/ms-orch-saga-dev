package com.patroclos.common.dto;



import java.util.UUID;


public class OrchestratorRequestDTO {

    private Integer customerId;
    private UUID itemId;
    private UUID orderId;
    private Double amount;
    public Integer getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
    public UUID getItemId() {
        return itemId;
    }
    public void setItemId(UUID itemId) {
        this.itemId = itemId;
    }
    public UUID getOrderId() {
        return orderId;
    }
    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }

}
