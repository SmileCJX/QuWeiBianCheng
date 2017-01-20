package ch6;

import java.util.Scanner;

public class Ch6_5 {
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		int a,b,c;
		String go;
		do{
			System.out.println("请输入一个分数(a/b):");
			String s = input.next();
			int index = s.indexOf('/');
			a = Integer.parseInt(s.substring(0,index));
			b = Integer.parseInt(s.substring(index+1));
			System.out.println("它可被分解为:");
			while(true){
				if (b%a!=0){
					c = b/a + 1;
				}
				else{
					c = b/a;
					a = 1;
				}
				if (a==1){
					System.out.println("1/"+c);	
					break;
				}else{
					System.out.println("1/"+c);
				}
				a = a*c-b;
				b = b*c;	
			}
			System.out.println("继续吗(y/n)?");
			go = input.next();
			
		}while(go.equals("y"));
		System.out.println("程序结束");
	}
}
