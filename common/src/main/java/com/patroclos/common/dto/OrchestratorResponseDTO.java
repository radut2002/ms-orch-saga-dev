package com.patroclos.common.dto;


import java.util.UUID;

import com.patroclos.common.enums.OrderStatus;


public class OrchestratorResponseDTO {

    private Integer customerId;
    private UUID orderId;
    private Double amount;
    private OrderStatus status;
    public Integer getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
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
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }

}
