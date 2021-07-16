package com.two;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class GobangTest {

    public static void main(String[] args) {

        Gobang cobang=new Gobang();
        cobang.DrawChessboard(true);
       // System.out.println("棋盘已绘制完,请输入黑子您要下在第几行第几列,输入格式为【1 3】");
        int index=1;
        while(cobang.getFalg()){//
            cobang.JudgeChess(index);//提示下棋
            index++;
        }

    }
}
