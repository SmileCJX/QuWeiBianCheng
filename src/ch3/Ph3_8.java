package ch3;

public class Ph3_8 {
	public static void main(String[] args){
		int i; 
		System.out.println("要找的数如下：");
		long begin = System.currentTimeMillis();
		for (i = 101; i<=999; i++){
			fanXu(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("time = "+ (end-begin));
	}
	
	public static void fanXu(int n){
		int i,j,k;
		i = n/100;
		j = n/10 % 10;
		k = n % 10;
		
		int fx = k*100+j*10+i;
		
		if (n*fx == 280021){
			System.out.println(n);
		}
	}
}
