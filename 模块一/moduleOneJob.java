/*
��ҵһ �ʼǵ�ַ:https://shimo.im/docs/pmkxQmdv6GCv24AN/ ��Java���Ի�����ģ��һ�������ɸ������Ӻ���ʯī�ĵ� App ��С�����
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
		int[] days={31,28,31,30,31,30,31,31,30,31,30,31};//һ�������·ݵ�����������2��
		//1�����������գ��ж��ǵ�ǰ��ĵڼ��죻
		//a���ж�����Ƿ�Ϊ����
		System.out.println("���������~");
		int yearIn=sc.nextInt();//δ�ж�����ĸ�ʽ���������
		if(yearIn<=0){
			System.out.println("������ݲ���ȷ������������");
			return;
			}
		if((yearIn%4==0&&yearIn%100!=0)||yearIn%400==0){
			days[1]=29;
		}
		//b���ж��·��Ƿ�����ɹ�
		System.out.println("�������·�~");
		int monthIn=sc.nextInt();
		
		if(monthIn>12||monthIn<=0){
			System.out.println("�����·ݲ���ȷ������������");
			return;
		}else{
			monthIn=monthIn-1;
			}
			//c���������ڲ��ж��Ƿ�������ȷ
		System.out.println("��������~");
		int dayIn=sc.nextInt();
		if(days[monthIn]<dayIn||dayIn<=0){
			System.out.println("�������ڲ���ȷ������������");
			return;
			}
			//��������
		
		for(int i=0;i<monthIn;i++)
		{
			sum+=days[i];
		}
		sum+=dayIn;
		System.out.println("��ǰ�����ǵ�"+sum+"��");
		System.out.println("------------------------------------------------------");
		
		//2������ҳ� 1000 ���ڵ�������������ӡ������
		//   ��ν��������һ����ǡ�õ�����������֮�ͣ� �磺 6=1��2��3
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
		//3��ʵ��˫ɫ��齱��Ϸ�н���������ɣ��н������� 6 ���������� 1 �����������ɡ�
        //���к������Ҫ��������� 6 �� 1~33 ֮�䲻�ظ���������롣
        //�����������Ҫ��������� 1 �� 1~16 ֮���������롣
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
		//������
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
		//System.out.println("�ָ���---------------  ");
		num2[6]=rd.nextInt(16);
		for(int i=0;i<7;i++)
		{
			System.out.print(num2[i]+"  ");
		}
		System.out.println();
		System.out.println("------------------------------------------------------");
		//4���Զ����������ݹ��򣬵��Ѵ洢Ԫ�������ﵽ�������� 80%ʱ������ 1.5 ����
		System.out.println("�����鳤��");
		int capacity=sc.nextInt();//5
		int[] arry1=new int[capacity];index=0;
		while(true){
			double flagindex=capacity*0.8;
			System.out.println("����������,����[-1]���˳�ѭ��");
			int numin=sc.nextInt();
			if(numin==-1){
				
			System.out.print("����Ϊ"+arry1.length);
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
		//5��ʹ��˫��ѭ��ʵ����������Ϸ���̵Ļ���
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