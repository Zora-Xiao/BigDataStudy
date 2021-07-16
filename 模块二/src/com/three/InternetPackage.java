package com.three;
/*
 上网套餐
 */
public class InternetPackage extends ShowAbstract implements NetFlowServerInterface {
    private String netFlow;//上网流量
    //private String monthlyRate;//每月资费

    public InternetPackage(String netFlow, String monthlyRate) {
        setNetFlow(netFlow);
        setMonthlyRate(monthlyRate);
    }

    public InternetPackage() {

    }

    //public static final CardEnum bigcard= CardEnum.BIGCARD;
    //public static final CardEnum smallcard= CardEnum.SMALLCARD;
    //public static final CardEnum miniaturecard= CardEnum.MINIATURECARD;

    public void setNetFlow(String netFlow) {
        this.netFlow = netFlow;
    }

    public String getNetFlow() {
        return netFlow;
    }

    //显示所有套餐信息
    @Override
    public void showPackageInfo()
    {
        System.out.print("上网流量"+getNetFlow()+",每月资费"+getMonthlyRate());
    }

    @Override
    public void netflowServer(String netFlow,CardEnum cardtype) {
        setNetFlow(netFlow);
        showPackageInfo();
        System.out.print("手机卡类型为"+cardtype);
        System.out.println();
    }
}
