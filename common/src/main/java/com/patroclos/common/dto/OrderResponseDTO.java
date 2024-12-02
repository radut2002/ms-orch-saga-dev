package com.patroclos.common.dto;



import java.time.LocalDateTime;
import java.util.UUID;

import com.patroclos.common.enums.OrderStatus;


public class OrderResponseDTO {

    private UUID orderId;
    private Integer customerId;
    private UUID itemId;
    private Double amount;
    private OrderStatus status;
    private LocalDateTime created;
    public UUID getOrderId() {
        return orderId;
    }
    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }
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
    public LocalDateTime getCreated() {
        return created;
    }
    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

}
