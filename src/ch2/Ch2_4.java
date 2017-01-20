package ch2;
//评委评分
import java.util.Scanner;

public class Ch2_4 {
	public static void main(String[] args) {
		double max = 0,min = 100,sum=0;
		double a[] = new double[10];
		System.out.println("请输入10个分数");
		Scanner input = new Scanner(System.in);
		
		for (int i=0; i<10; i++){
			a[i] = input.nextDouble();
			
			if (a[i]>max)
				max = a[i];
			if (a[i]<min)
				min = a[i];
			sum = sum + a[i];
		}
		
		System.out.println("去掉一个最高分"+max+"去掉一个最低分"+min);
		System.out.println("最终平均得分"+(sum-max-min)/8);
	}
}
