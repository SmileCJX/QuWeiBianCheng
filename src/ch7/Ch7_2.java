package ch7;
//汉诺塔问题求解
import java.util.Scanner;

public class Ch7_2 {
	static long count;
	static void hanoi(int n,char a,char b,char c){
		if(n==1){
			System.out.printf("第%d次移动：\t圆盘从%c棒移动到%c棒\n",++count,a,c);
		}else{
			hanoi(n-1,b,a,c);
			System.out.printf("第%d次移动：\t圆盘从%c棒移动到%c棒\n",++count,a,c);
			hanoi(n-1,b,a,c);
		}
	}
	public static void main(String[] args) {
		int n;
		count = 0;
		System.out.println("汉诺塔问题求解：");
		System.out.println("请输入汉诺塔圆盘的数量");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		hanoi(n,'A','B','C');
		System.out.println("求解完毕，总共需要"+count+"步移动");
	}
}
