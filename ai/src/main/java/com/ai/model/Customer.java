package com.ai.model;


public class Customer {

    private String state;
    private int accountLength;
    private int areaCode;
    private String phone;
    private boolean intlPlan;
    private boolean vmailPlan;
    private int vmailMessage;
    private double dayMins;
    private int dayCalls;
    private double dayCharge;
    private double eveMins;
    private int eveCalls;
    private double eveCharge;
    private double nightMins;
    private int nightCalls;
    private double nightCharge;
    private double intlMins;
    private int intlCalls;
    private double intlCharge;
    private int custServCalls;
    private boolean churn;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getAccountLength() {
        return accountLength;
    }

    public void setAccountLength(int accountLength) {
        this.accountLength = accountLength;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isIntlPlan() {
        return intlPlan;
    }

    public void setIntlPlan(boolean intlPlan) {
        this.intlPlan = intlPlan;
    }

    public boolean isVmailPlan() {
        return vmailPlan;
    }

    public void setVmailPlan(boolean vmailPlan) {
        this.vmailPlan = vmailPlan;
    }

    public int getVmailMessage() {
        return vmailMessage;
    }

    public void setVmailMessage(int vmailMessage) {
        this.vmailMessage = vmailMessage;
    }

    public double getDayMins() {
        return dayMins;
    }

    public void setDayMins(double dayMins) {
        this.dayMins = dayMins;
    }

    public int getDayCalls() {
        return dayCalls;
    }

    public void setDayCalls(int dayCalls) {
        this.dayCalls = dayCalls;
    }

    public double getDayCharge() {
        return dayCharge;
    }

    public void setDayCharge(double dayCharge) {
        this.dayCharge = dayCharge;
    }

    public double getEveMins() {
        return eveMins;
    }

    public void setEveMins(double eveMins) {
        this.eveMins = eveMins;
    }

    public int getEveCalls() {
        return eveCalls;
    }

    public void setEveCalls(int eveCalls) {
        this.eveCalls = eveCalls;
    }

    public double getEveCharge() {
        return eveCharge;
    }

    public void setEveCharge(double eveCharge) {
        this.eveCharge = eveCharge;
    }

    public double getNightMins() {
        return nightMins;
    }

    public void setNightMins(double nightMins) {
        this.nightMins = nightMins;
    }

    public int getNightCalls() {
        return nightCalls;
    }

    public void setNightCalls(int nightCalls) {
        this.nightCalls = nightCalls;
    }

    public double getNightCharge() {
        return nightCharge;
    }

    public void setNightCharge(double nightCharge) {
        this.nightCharge = nightCharge;
    }

    public double getIntlMins() {
        return intlMins;
    }

    public void setIntlMins(double intlMins) {
        this.intlMins = intlMins;
    }

    public int getIntlCalls() {
        return intlCalls;
    }

    public void setIntlCalls(int intlCalls) {
        this.intlCalls = intlCalls;
    }

    public double getIntlCharge() {
        return intlCharge;
    }

    public void setIntlCharge(double intlCharge) {
        this.intlCharge = intlCharge;
    }

    public int getCustServCalls() {
        return custServCalls;
    }

    public void setCustServCalls(int custServCalls) {
        this.custServCalls = custServCalls;
    }

    public boolean isChurn() {
        return churn;
    }

    public void setChurn(boolean churn) {
        this.churn = churn;
    }
}
