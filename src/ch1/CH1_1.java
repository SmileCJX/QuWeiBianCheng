package ch1;

import java.util.Scanner;

public class CH1_1 {
	public static void main(String[] args) {
		int i, j, k, n;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入金字塔行数:");
		n = input.nextInt();
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			// System.out.printf("\n");
			System.out.println();
		}
	}
}
