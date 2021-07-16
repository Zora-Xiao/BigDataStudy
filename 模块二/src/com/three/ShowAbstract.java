package com.three;

public abstract class ShowAbstract {

    private String monthlyRate;//每月资费

    public void setMonthlyRate(String monthlyRate) {
        this.monthlyRate = monthlyRate;
    }
    public String getMonthlyRate() {
        return monthlyRate;
    }

    //自定义抽象方法
    public abstract void showPackageInfo();
}
