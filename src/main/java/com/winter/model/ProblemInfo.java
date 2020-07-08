package com.winter.model;

public class ProblemInfo extends ProblemInfoKey {
    private String kindId;

    private String problemName;

    public String getKindId() {
        return kindId;
    }

    public void setKindId(String kindId) {
        this.kindId = kindId == null ? null : kindId.trim();
    }

    public String getProblemName() {
        return problemName;
    }

    public void setProblemName(String problemName) {
        this.problemName = problemName == null ? null : problemName.trim();
    }
}