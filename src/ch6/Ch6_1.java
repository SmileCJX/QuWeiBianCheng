package ch6;
//�����Լ��
import java.util.Scanner;

public class Ch6_1 {
	public static void main(String[] args) {
		int m,n,t1;
		Scanner input = new Scanner(System.in);
		System.out.println("�������һ������");
		m = input.nextInt();
		System.out.println("������ڶ�������");
		n = input.nextInt();
		t1 = gcd(m,n);
		System.out.println("���Լ��Ϊ:"+t1);
	}

	private static int gcd(int m, int n) {
		int temp = 0;
		if (m<n){//�Ƚ���һ���Ƚϴ�С
			temp = m;
			m = n;
			n = temp;
		}
		while(n!=0){//�ж����Լ�������Ĵ���
			temp = m%n;
			m = n;
			n = temp;
		}
		return m;
	}
}
