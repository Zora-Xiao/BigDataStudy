package com.three;
/*
用户消费信息
 */
public class ConsumerInformation {
    private String totalTalkTime;//统计通话时长
    private String totalNetFlow;//统计上网流量
    private String monthlyConsumptionAmount;//每月消费金额

    public ConsumerInformation(String totalTalkTime, String totalNetFlow, String monthlyConsumptionAmount) {
        setTotalTalkTime(totalTalkTime);
        setTotalNetFlow(totalNetFlow);
        setMonthlyConsumptionAmount(monthlyConsumptionAmount);
    }

    public ConsumerInformation() {
    }

    public void setTotalTalkTime(String totalTalkTime) {
        this.totalTalkTime = totalTalkTime;
    }

    public void setTotalNetFlow(String totalNetFlow) {
        this.totalNetFlow = totalNetFlow;
    }

    public void setMonthlyConsumptionAmount(String monthlyConsumptionAmount) {
        this.monthlyConsumptionAmount = monthlyConsumptionAmount;
    }

    public String getTotalTalkTime() {
        return totalTalkTime;
    }

    public String getTotalNetFlow() {
        return totalNetFlow;
    }

    public String getMonthlyConsumptionAmount() {
        return monthlyConsumptionAmount;
    }

}
