package com.three;
/*
手机卡
* */
public class MobileCard {
    private String cardType;//卡类型
    private String cardNo;//卡号
    private String userName;//用户名
    private String passWord;//密码
    private String accountBalance;//账户余额
    private String talkTime;//通话时长(分钟)
    private String netFlow;//上网流量

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public MobileCard() {

    }

    public MobileCard(String cardType, String cardNo, String userName, String passWord, String accountBalance, String talkTime, String netFlow) {
        setCardType(cardType);
        setCardNo(cardNo);
        setUserName(userName);
        setPassWord(passWord);
        setAccountBalance(accountBalance);
        setTalkTime(talkTime);
        setNetFlow(netFlow);
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setTalkTime(String talkTime) {
        this.talkTime = talkTime;
    }

    public void setNetFlow(String netFlow) {
        this.netFlow = netFlow;
    }

    public String getCardType() {
        return cardType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getAccountBalance() {
        return accountBalance;
    }

    public String getTalkTime() {
        return talkTime;
    }

    public String getNetFlow() {
        return netFlow;
    }

    //显示（卡号、用户民、当前余额）
    public void show()
    {

    }

}
