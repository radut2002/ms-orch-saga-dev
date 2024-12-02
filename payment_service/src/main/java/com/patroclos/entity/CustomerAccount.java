package com.patroclos.entity;

import java.util.UUID;

import org.springframework.data.relational.core.mapping.Table;

import nonapi.io.github.classgraph.json.Id;


@Table("customerAccounts")
public class CustomerAccount {

    @Id
    private UUID id;
    private Integer customerId;
    private Double balance;
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public Integer getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
