package ch4;
/*
 * 素数的平方是回文，比如11*11=121，求不超过1000的回文素数
 * 
 */
public class Ch4_6 {
	public static void main(String[] args) {
		System.out.println("1000以内的平方回文素数如下");
		for (int i=2; i<1000; i++){
			if (prime(i)==1 && pa(i*i)==1){
				System.out.println(i+"*"+i+"="+i*i);
			}
		}
	}
	public static int prime(int a){
		//循环整除
		for (int i=2; i<=Math.sqrt(a); i++){
			//整除，非素数
			if (a % i ==0){
				return 0;
			}
		}
		return 1;
	}
	
	public static String trans(int bk){
		int a = bk;
		//初始化
		String res = "";
		//循环处理，直至为0
		while(a !=0){
			int b = a % 10;//取最低位
			res = b + res;//转换为字符串
			a = a / 10;//去掉最低位
		}
		return res;
	}
	
	public static int pa(int a){
		String str= trans(a);//把数a转换为字符串
		int ls = str.length();//取得字符串长度
		for (int i=0; i<ls; i++){
			if(str.codePointAt(i)!=str.codePointAt(ls-1-i)){//首位对称比较
				return 0;
			}
		}
		return 1;
	}
	
	
}
