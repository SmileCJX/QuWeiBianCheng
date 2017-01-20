package ch6;

//比较两个分母的大小
import java.util.Scanner;

public class Ch6_3 {
	public static int divisor(int a, int b) {//找最大公约数
		int temp;
		if (a < b) {
			temp = a;
			a = b;
			b = temp;
		}
		while (b != 0) {
			temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}

	public static int multiple(int a, int b) {//求最小公倍数
		int temp;
		temp = divisor(a, b);
		return a * b / temp;
	}

	public static char tongFen(int fz1, int fm1, int fz2, int fm2) {//通分
		char flag = ' ';
		int gbs = multiple(fm1, fm2);
		int xfz1 = gbs / fm1 * fz1;
		int xfz2 = gbs / fm2 * fz2;

		System.out.println(fz1 + "/" + fm1 + " = " + xfz1 + "/" + gbs);
		System.out.println(fz2 + "/" + fm2 + " = " + xfz2 + "/" + gbs);

		if (xfz1 > xfz2) {
			flag = '>';
		} else if (xfz1 < xfz2) {
			flag = '<';
		} else {
			flag = '=';
		}
		return flag;
	}

	public static void main(String[] args) {
		char flag = ' ';
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个分数:");
		String s1 = input.next();
		System.out.println("请输入第二个分数");
		String s2 = input.next();

		int index1 = s1.indexOf('/');
		int fz1 = Integer.parseInt(s1.substring(0, index1));
		int fm1 = Integer.parseInt(s1.substring(index1 + 1));

		int index2 = s2.indexOf('/');
		int fz2 = Integer.parseInt(s2.substring(0, index2));
		int fm2 = Integer.parseInt(s2.substring(index2 + 1));

		if (fz1 == fz2) {
			System.out.println("同分子比大小");
			if (fm1 > fm2) {
				flag = '<';
			} else if (fm1 < fm2) {
				flag = '>';
			} else {
				flag = '=';
			}
		} else if (fm1 == fm2) {
			System.out.println("同分母比较大小");
			if (fz1 > fz2) {
				flag = '>';
			} else if (fz1 < fz2) {
				flag = '<';
			} else {
				flag = '=';
			}
		} else {
			System.out.println("异分母，异分子比较大小");
			flag = tongFen(fz1, fm1, fz2, fm2);
		}

		System.out.println("结果如下:" + s1 + flag + s2);
	}
}
