package ch4;

public class Ch4_5 {
	public static int prime(int a){
		for (int i=2; i<=Math.sqrt(a); i++){
			if (a % i==0){
				return 0;
			}
		}
		return 1;
	}
	public static  String trans(int bk){
		int a = bk;
		String res = "";
		while (a != 0){
			int b = a % 10;
			res = b + res;
			a = a / 10;
		}
		return res;
	}
	public  static int huiWen(int a){
		String str = trans(a);
		int ls = str.length();
		for (int i=0; i<ls; i++){
			//if (str.codePointAt(i)!=str.codePointAt(ls-1-i)){
			if (str.charAt(i)!=str.charAt(ls-1-i)){
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		System.out.println("1000以内的回文素数如下：");
		for (int i=2; i<=1000; i++){
			if (prime(i)==1&&huiWen(i)==1){
				System.out.print(i+"  ");
			}
		}
		System.out.println();
	}
}
