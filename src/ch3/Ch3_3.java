package ch3;

public class Ch3_3 {
	public static void main(String[] args){
		int i,j,sum;
		for (i=2; i<1000; i++){
			sum = 0;
			for(j=1; j<=i/2; j++){
				if (i%j==0)
					sum =sum+j;
			}
			if (sum==i)
				printwanshu(i);
		}
	}
	
	public static void printwanshu(int n){
		int j;
		System.out.print(n+"的约数（自身除外）为：");
		for (j=1; j<=n/2; j++){
			if(n%j==0)
				System.out.print(j+" ");
		}
		System.out.println("\n");
	}
}
