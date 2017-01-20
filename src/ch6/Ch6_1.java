package ch6;
//求最大公约数
import java.util.Scanner;

public class Ch6_1 {
	public static void main(String[] args) {
		int m,n,t1;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个整数");
		m = input.nextInt();
		System.out.println("请输入第二个整数");
		n = input.nextInt();
		t1 = gcd(m,n);
		System.out.println("最大公约数为:"+t1);
	}

	private static int gcd(int m, int n) {
		int temp = 0;
		if (m<n){//先进行一个比较大小
			temp = m;
			m = n;
			n = temp;
		}
		while(n!=0){//判断最大公约数，核心代码
			temp = m%n;
			m = n;
			n = temp;
		}
		return m;
	}
}
