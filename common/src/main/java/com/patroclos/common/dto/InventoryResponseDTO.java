package com.patroclos.common.dto;


import java.util.UUID;

import com.patroclos.common.enums.InventoryStatus;


public class InventoryResponseDTO {

    private UUID orderId;
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
    public InventoryStatus getStatus() {
        return status;
    }
    public void setStatus(InventoryStatus status) {
        this.status = status;
    }
    private Integer customerId;
    private UUID itemId;
    private InventoryStatus status;

}
