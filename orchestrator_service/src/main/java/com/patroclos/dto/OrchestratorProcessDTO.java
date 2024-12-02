package com.patroclos.dto;

import java.util.List;
import com.patroclos.entity.OrchestratorProcessStep;

public class OrchestratorProcessDTO {
	private String id;
    private String status;
    private List<OrchestratorProcessStep> orchestratorProcessSteps;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public List<OrchestratorProcessStep> getOrchestratorProcessSteps() {
        return orchestratorProcessSteps;
    }
    public void setOrchestratorProcessSteps(List<OrchestratorProcessStep> orchestratorProcessSteps) {
        this.orchestratorProcessSteps = orchestratorProcessSteps;
    }
    
}