package ch2;
//��ί����
import java.util.Scanner;

public class Ch2_4 {
	public static void main(String[] args) {
		double max = 0,min = 100,sum=0;
		double a[] = new double[10];
		System.out.println("������10������");
		Scanner input = new Scanner(System.in);
		
		for (int i=0; i<10; i++){
			a[i] = input.nextDouble();
			
			if (a[i]>max)
				max = a[i];
			if (a[i]<min)
				min = a[i];
			sum = sum + a[i];
		}
		
		System.out.println("ȥ��һ����߷�"+max+"ȥ��һ����ͷ�"+min);
		System.out.println("����ƽ���÷�"+(sum-max-min)/8);
	}
}
