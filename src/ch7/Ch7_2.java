package ch7;
//��ŵ���������
import java.util.Scanner;

public class Ch7_2 {
	static long count;
	static void hanoi(int n,char a,char b,char c){
		if(n==1){
			System.out.printf("��%d���ƶ���\tԲ�̴�%c���ƶ���%c��\n",++count,a,c);
		}else{
			hanoi(n-1,b,a,c);
			System.out.printf("��%d���ƶ���\tԲ�̴�%c���ƶ���%c��\n",++count,a,c);
			hanoi(n-1,b,a,c);
		}
	}
	public static void main(String[] args) {
		int n;
		count = 0;
		System.out.println("��ŵ��������⣺");
		System.out.println("�����뺺ŵ��Բ�̵�����");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		hanoi(n,'A','B','C');
		System.out.println("�����ϣ��ܹ���Ҫ"+count+"���ƶ�");
	}
}
