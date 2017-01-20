package ch5;

import java.util.Scanner;

public class Ch5_5 {
	public static void JTTl(int head,int foot,int[] tu,int[] ji){
		tu[0] = (foot-2*head)/2;
		ji[0] = 2*head - foot/2;
	}
	
	public static void main(String[] args) {
		int [] ji = {0},tu = {0};
		int head,foot;
		System.out.println("鸡兔同笼问题求解:");
		System.out.print("输入头数");
		Scanner input = new Scanner(System.in);
		head = input.nextInt();
		System.out.print("输入脚数:");
		foot = input.nextInt();
		
		JTTl(head,foot,tu,ji);
		System.out.println("鸡有"+ji[0]+"兔有"+tu[0]);
	}
}
