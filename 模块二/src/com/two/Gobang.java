package com.two;

import  java.util.Scanner;
public class Gobang {

    private String[] chessboardIndex={" ","0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};//棋盘编号
    private int  length_chessboardIndex=chessboardIndex.length;
    private String[][] chessboard=new String[length_chessboardIndex][length_chessboardIndex];//自定义棋盘内容
    private String[][] BlackChessman=new String[length_chessboardIndex][length_chessboardIndex];//记录黑色棋子
    private String[][] WhiteChessman=new String[length_chessboardIndex][length_chessboardIndex];//记录白色棋子
    private String white="O ";
    private String black="+ ";
    private String defChess="- ";
    private String content;
    private  Boolean falg=true;

    public void setFalg(Boolean falg) {
        this.falg = falg;
    }
    public Boolean getFalg() {
        return falg;
    }
    public void setContent(String content){
        this.content=content;
    }
    public String  getContent(){
        return content;
    }
    public Gobang() {
    }
    public Gobang(boolean falg){
        setFalg(falg);
    }
    //判断棋子下的位置是否正确，同时变化数组内容,重新绘制棋盘
    public void JudgeChess(int index){
        //获取棋子位置
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int surplus=index%2;

        //1、是否超过棋盘
        if(row>=chessboardIndex.length||col>=chessboardIndex.length||row==0||col==0)
        {
            System.out.println("您下棋的位置已超出边界，请重下");
            return;
        }
        //2、所下的位置是否存在其他棋子
        String chess=chessboard[row][col];
        String ChressName="";
        if(chess==defChess){
            //需要记录是谁在下棋
            if(surplus!=0){ //黑色棋子，提示白色棋子
                setContent(black);
                ChressName="黑色棋子";
            }else{ //白色棋子，提示黑色棋子
                setContent(white);
                ChressName="白色棋子";
               // WhiteChessman[row][col]=getContent();
            }

            chessboard[row][col]=getContent();
        }else{
            System.out.println("您下的位置已有棋子，请重下");
            return;
        }
        DrawChessboard(false);
        WinOrLost(row,col,getContent(),ChressName);
    }
    //判断谁胜利 contrastValue内容；
    public boolean WinOrLost(int row,int col,String contrastValue,String ChressName)
    {
      int  count1=0, count2=0, count3=0, count4=0;
      //横向判断 判断左右4个是否未一致
      for(int i=col;i>0;i--){
         if(chessboard[row][i]==contrastValue){
            count1++;
            }else{
              break;
             }
          }
      for(int i=col+1;i<16;i++){
         if(chessboard[row][i]==contrastValue){
          count1++;
             }else{
             break;
         }
      }
      if(count1==5){setFalg(false);System.out.println(ChressName+"棋子获胜");}
       // 纵向判断 判断上下4个是否未一致
        for(int i=row;i>0;i--){
            if(chessboard[i][col]==contrastValue){
                count2++;
            }else{
                break;
            }
        }
        for(int i=row+1;i<16;i++){
            if(chessboard[i][col]==contrastValue){
                count2++;
            }else{
                break;
            }
        }
        if(count2==5){setFalg(false);System.out.println(ChressName+"棋子获胜");}
         //正对角线判断 先判断最小值
        int minnum=0,maxnum=0;
        if(row>col){minnum=col;maxnum=row;}else{minnum=row;maxnum=col;}
        int rowi=row;int coli=col;
        for(int i=minnum;i>0;i--){
            if(chessboard[rowi][coli]==contrastValue){
                count3++;
            }else{
                break;
            }
            coli--;
            rowi--;
        }
         rowi=row; coli=col;//重置
        for(int i=maxnum;i<16;i++){
            if(chessboard[rowi][coli]==contrastValue){
                count3++;
            }else{
                break;
            }
            coli++;
            rowi++;
        }
        if(count3==5){setFalg(false);System.out.println(ChressName+"棋子获胜");}
        // 反对角线判断 列增行减，行增列减
        rowi=row; coli=col;//重置
        for (int i=row;i>0;i--){
            if(coli>=16){
                break;
            }
            if(chessboard[rowi][coli]==contrastValue){
                count4++;
            }else {
                break;
            }
            coli++;rowi--;
        }
        rowi=row; coli=col;//重置
        for(int i=row;i<16;i++){
            if(coli<=0){break;}
            if(chessboard[rowi][coli]==contrastValue){
                count4++;
            }else{
                break;
            }
            coli--;
            rowi++;
        }
        if(count4==5){setFalg(false);System.out.println(ChressName+"棋子获胜");}
        return getFalg();
    }
    //初始化棋盘 :判断是否为第一次加载
    public void DrawChessboard(boolean falg){
            for (int i=0;i<length_chessboardIndex;i++){
                for (int j=0;j<length_chessboardIndex;j++){
                    if(falg){
                        if(i==0){
                         chessboard[i][j]=this.chessboardIndex[j]+" ";
                        }else if(j==0){
                         chessboard[i][j]=this.chessboardIndex[i]+" ";
                         }else{
                         chessboard[i][j]=defChess;
                     }
                   }
                    System.out.print(chessboard[i][j]);
                }
                System.out.println(" ");
            }
            if(getFalg()){
                if(getContent()==black){
                  System.out.println("请输入执白色棋子要下的位置,输入格式为【1 3】");
                 }else{
                     System.out.println("请输入执黑色棋子要下的位置,输入格式为【1 3】");
                 }
            }
        }
}
