package com.three;
/*
手机卡的枚举
 */
public enum CardEnum {
    BIGCARD,SMALLCARD
        /*@Override
        public void netflowServer() {
            System.out.println("上网套餐使用的为"+getCardType());
        }
        @Override
        public void talkServer() {
            System.out.println("通讯套餐使用的为"+getCardType());
        }*/
    ,MINIATURECARD;

    private String cardType;


    //public static final CardEnum BIGCARD=new CardEnum();

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardType() {
        return cardType;
    }
    CardEnum() {
    }

     CardEnum(String cardType) {
        setCardType(cardType);
    }

}
