package com.three;
/*
通话套餐类
 */
public class CallPackage extends ShowAbstract implements TalkServerInterface {

    private String talkTime;//通话时长(分钟)
    private String msgNum;//短信条数

    public CallPackage(String talkTime, String msgNum, String monthlyRate) {
       setTalkTime(talkTime);
       setMsgNum(msgNum);
       setMonthlyRate(monthlyRate);
    }

    public CallPackage() {
    }

    public void setTalkTime(String talkTime) {
        this.talkTime = talkTime;
    }

    public void setMsgNum(String msgNum) {
        this.msgNum = msgNum;
    }


    public String getTalkTime() {
        return talkTime;
    }

    public String getMsgNum() {
        return msgNum;
    }


    //显示所有套餐信息
    @Override
    public void showPackageInfo()
    {
        System.out.println("通话时长为"+getTalkTime()+",短信条数为"+getMsgNum()+",每月资费"+getMonthlyRate());

    }

    @Override
    public void talkServer(String talkTime,CardEnum cardtype) {
        setTalkTime(talkTime);
        showPackageInfo();
        System.out.println("手机卡类型为"+cardtype);
    }
}
