package com.one;

public class ArrayPrintSum {

    public static void main(String[] args) {
        //定义一个长度为[16][16]的二维数组
        int[][] arrayInt=new int[16][16];
        int lTor_Sum=0;//左上到右下的和
        int rTol_Sum=0;//右上到左下的和
        int sum=0;//所有元素的和
        for (int i=0;i<16;i++){
            for (int j=0;j<16;j++){
                //给每个元素赋值
                arrayInt[i][j]=i+j;
                //拿到左上到右下的元素值
                if(i==j){
                    lTor_Sum+=arrayInt[i][j];
                }
                //获取右上到左下的元素值
                if((i+j)==15){
                    rTol_Sum+=arrayInt[i][j];
                }
                //索取所有元素的累计
                sum +=arrayInt[i][j];
                System.out.print(i+j+" ");
            }
            System.out.println("");

        }
        System.out.println("左上到右下的和:"+lTor_Sum+";右上到左下的和:"+rTol_Sum+";数组累计和:"+sum);
    }
}
