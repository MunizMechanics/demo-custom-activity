package com.example.demo;

import java.util.Map;

public class ExecutePayload {

    private String mode;

    private String activityId;

    private String activityObjectID;

    private String definitionInstanceId;

    private String keyValue;

    private Map<String, String>[] outArguments;

    private Map<String, String>[] inArguments;

    private String activityInstanceId;

    private String journeyId;

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getActivityObjectID() {
        return activityObjectID;
    }

    public void setActivityObjectID(String activityObjectID) {
        this.activityObjectID = activityObjectID;
    }

    public String getDefinitionInstanceId() {
        return definitionInstanceId;
    }

    public void setDefinitionInstanceId(String definitionInstanceId) {
        this.definitionInstanceId = definitionInstanceId;
    }

    public String getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    public Map<String, String>[] getOutArguments() {
        return outArguments;
    }

    public void setOutArguments(Map<String, String>[] outArguments) {
        this.outArguments = outArguments;
    }

    public Map<String, String>[] getInArguments() {
        return inArguments;
    }

    public void setInArguments(Map<String, String>[] inArguments) {
        this.inArguments = inArguments;
    }

    public String getActivityInstanceId() {
        return activityInstanceId;
    }

    public void setActivityInstanceId(String activityInstanceId) {
        this.activityInstanceId = activityInstanceId;
    }

    public String getJourneyId() {
        return journeyId;
    }

    public void setJourneyId(String journeyId) {
        this.journeyId = journeyId;
    }
}
