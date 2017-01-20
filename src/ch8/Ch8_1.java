package ch8;
//分解质因数
import java.util.Scanner;

public class Ch8_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" 请输入一个数");
		int n = input.nextInt();

		if (PrimeNum(n)) {
			System.out.println("这是一个素数不需要分解");
		} else {
			System.out.println("这个数可以被分解为");
			for (int i = 2; i <= n;) {
				if (n % i == 0) {
					if (n / i == 1) {
						System.out.print(i);
						break;
					} else {
						System.out.print(i + "*");
						n = n / i;
					}
				} else {
					i++;
				}
			}
		}
	}

	private static boolean PrimeNum(int n) {
		boolean flag = true;
		for (int j = 2; j <= n / 2; j++) {
			if (n % j == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

}
