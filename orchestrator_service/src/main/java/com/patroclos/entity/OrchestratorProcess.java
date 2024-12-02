package com.patroclos.entity;


import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import com.patroclos.enums.ProcessStatus;

import jakarta.persistence.Entity;

@Table(name = "orchestratorProcess")
@Entity
public class OrchestratorProcess {

    @Id
    private UUID id;
    private ProcessStatus status;
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public ProcessStatus getStatus() {
        return status;
    }
    public void setStatus(ProcessStatus status) {
        this.status = status;
    }
    
}