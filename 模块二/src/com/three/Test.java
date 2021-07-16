package com.three;

//实现功能
public class Test {
    public static void main(String[] args) {
        InternetPackage internetPackage=new InternetPackage("1024G","50元");
        internetPackage.netflowServer("1024G",CardEnum.BIGCARD);
        CallPackage callPackage=new CallPackage("200分钟","20条","50元");
        callPackage.talkServer("300分钟",CardEnum.MINIATURECARD);
    }
}
