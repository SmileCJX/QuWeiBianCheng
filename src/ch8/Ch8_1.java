package ch8;
//�ֽ�������
import java.util.Scanner;

public class Ch8_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" ������һ����");
		int n = input.nextInt();

		if (PrimeNum(n)) {
			System.out.println("����һ����������Ҫ�ֽ�");
		} else {
			System.out.println("��������Ա��ֽ�Ϊ");
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
