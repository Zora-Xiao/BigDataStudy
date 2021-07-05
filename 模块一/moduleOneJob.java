/*
作业一 笔记地址:https://shimo.im/docs/pmkxQmdv6GCv24AN/ 《Java语言基础（模块一）》，可复制链接后用石墨文档 App 或小程序打开
*/

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class moduleOneJob
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in); 
		int sum=0;
		int[] days={31,28,31,30,31,30,31,31,30,31,30,31};//一年所有月份的天数，除了2月
		//1、输入年月日，判断是当前年的第几天；
		//a、判断年份是否为闰年
		System.out.println("请输入年份~");
		int yearIn=sc.nextInt();//未判断输入的格式不符的情况
		if(yearIn<=0){
			System.out.println("输入年份不正确，请重新再来");
			return;
			}
		if((yearIn%4==0&&yearIn%100!=0)||yearIn%400==0){
			days[1]=29;
		}
		//b、判断月份是否输入成功
		System.out.println("请输入月份~");
		int monthIn=sc.nextInt();
		
		if(monthIn>12||monthIn<=0){
			System.out.println("输入月份不正确，请重新再来");
			return;
		}else{
			monthIn=monthIn-1;
			}
			//c、输入日期并判断是否输入正确
		System.out.println("请输入日~");
		int dayIn=sc.nextInt();
		if(days[monthIn]<dayIn||dayIn<=0){
			System.out.println("输入日期不正确，请重新再来");
			return;
			}
			//计算天数
		
		for(int i=0;i<monthIn;i++)
		{
			sum+=days[i];
		}
		sum+=dayIn;
		System.out.println("当前日期是第"+sum+"天");
		System.out.println("------------------------------------------------------");
		
		//2、编程找出 1000 以内的所有完数并打印出来。
		//   所谓完数就是一个数恰好等于它的因子之和， 如： 6=1＋2＋3
		Boolean falg=true;
		int index=0;sum=0;
		while(falg)
		{
			sum+=index;
			if(sum<=1000)
			{
				System.out.print(sum+"   ");
			}else{
				falg=false;
			}
			index++;
		}
		System.out.println();
		System.out.println("------------------------------------------------------");
		//3、实现双色球抽奖游戏中奖号码的生成，中奖号码由 6 个红球号码和 1 个蓝球号码组成。
        //其中红球号码要求随机生成 6 个 1~33 之间不重复的随机号码。
        //其中蓝球号码要求随机生成 1 个 1~16 之间的随机号码。
		Random rd=new Random();
		int[] num2=new int[7];
		// for(int i=0;i<6;i++)
		// {
			// int ran1=0;
			// falg=false; 
			// for(int j=0;j<6;j++){
				// ran1=rd.nextInt(33);
				// if(num2[j]!=ran1){
					// falg=true;
				// }else{
					// falg=false;
			    // }
			// }
			// //System.out.print(ran1+"  ");
			// if(falg){num2[i]=ran1;}	
		// }
		//方法二
		index=-1;
		while(index<5)
		{
			int ran=rd.nextInt(33);
			//System.out.print(ran+"  ");
			if(Arrays.binarySearch(num2,ran)!=-1)
			{
				index++;
				//System.out.print("1  ");
				num2[index]=ran;
			}
		}
		//System.out.println("分割线---------------  ");
		num2[6]=rd.nextInt(16);
		for(int i=0;i<7;i++)
		{
			System.out.print(num2[i]+"  ");
		}
		System.out.println();
		System.out.println("------------------------------------------------------");
		//4、自定义数组扩容规则，当已存储元素数量达到总容量的 80%时，扩容 1.5 倍。
		System.out.println("请数组长度");
		int capacity=sc.nextInt();//5
		int[] arry1=new int[capacity];index=0;
		while(true){
			double flagindex=capacity*0.8;
			System.out.println("请输入整数,输入[-1]则退出循环");
			int numin=sc.nextInt();
			if(numin==-1){
				
			System.out.print("长度为"+arry1.length);
				break;
			}
			if(index>flagindex){
				int[] array2=arry1;
				capacity= capacity+(int)(capacity*0.5);
				arry1=new int[capacity];
				for(int i=0;i<array2.length;i++)
				{
					arry1[i]=array2[i];
				}
			}
			arry1[index]=numin;
			index++;
		}
		System.out.println("------------------------------------------------------");
		//5、使用双重循环实现五子棋游戏棋盘的绘制
		String[] strArray={" ","0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
		for(int i=0;i<strArray.length;i++)
		{
			for(int j=0;j<strArray.length;j++)
			{
				if(i==0){
					System.out.print(strArray[j]+" ");
				}else if(j==0){
					System.out.print(strArray[i]+" ");
				}else{
					System.out.print("+ ");
					
				}
				//strArrays[i][j]=strArray[j];
			}
			System.out.println();
		}
		
		
		
	}
	
}