package ch4;
/*
 * 法国数学家梅森尼对这类形如2^n-1的素数特别感兴趣，做过许多有意义的工作，后人就把此类数命名为梅森尼数
 * 已经证明了，如果2^n-1是素数，则幂指数n必须为素数，然而，反过来并不对，当n时素数时,2^n-1不一定是素数，列如，人们已经找到了
 * 2^11-1是一个合数，23可以除尽它，2^23-1是一个合数，47可以除尽它
 */
public class Ch4_7 {
	public static void main(String[] args) {
		double t,m;
		int j,n;
		int count;
		count = 0;//計時器
		t = 2;
		
		for (n=2; n<=50; n++){//指定范围
			t = t*2;//累乘量
			m = t - 1;
			int x = 0;//x为0，代表是素数：为1，代表不是素数
			for (j = 3; j<Math.sqrt(m)+1; j+=2){
				if (m%j==0){
					x =1;
					break;
				}
			}
			if (x == 0){
				count++;
				System.out.println(n+"*"+n+"-1="+m);
			}
		}
		System.out.println("指数n于【2,50】中梅森尼数共有"+count+"个");
	}
}
