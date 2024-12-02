package com.patroclos.entity;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import jakarta.persistence.Entity;


@Table(name = "orchestratorProcessStep")
@Entity
public class OrchestratorProcessStep {
	
    @Id
    private UUID id;
    @Column("orchestratorProcess_id")
    private String orchestratorProcessId;
    @Column("stepType")
    private String stepType;
    private String name;
    private String error;
    @Column("statusStep")
    private String statusStep;
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getOrchestratorProcessId() {
        return orchestratorProcessId;
    }
    public void setOrchestratorProcessId(String orchestratorProcessId) {
        this.orchestratorProcessId = orchestratorProcessId;
    }
    public String getStepType() {
        return stepType;
    }
    public void setStepType(String stepType) {
        this.stepType = stepType;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }
    public String getStatusStep() {
        return statusStep;
    }
    public void setStatusStep(String statusStep) {
        this.statusStep = statusStep;
    }
}
