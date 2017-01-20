package ch7;
//求斐波那契数列的第n项
import java.util.Scanner;

public class Ch7_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int i = input.nextInt();
		int result = fibonaccici(i);
		System.out.println(result);
		System.exit(0);
	}

	private static int fibonaccici(int i) {
		if (i==1 || i==2){
			return 1;
		}
		if (i>2){
			return fibonaccici(i-2)+fibonaccici(i-1);
		}
		return 0;
	}
}
