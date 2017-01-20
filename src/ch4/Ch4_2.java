package ch4;

public class Ch4_2 {
	public static void main(String[] args) {
		int i,j;
		int flag,n=0;
		int a[] = new int[100];
		for (i=2; i<=100; i++){
			flag = 1;
			for (j=2; j<i; j++){
				if (i%j==0){
					flag = 0;
					break;
				}
			}
			if (flag == 1){
				a[n] = i;
				n++;
			}
		}
		System.out.println("100以内的孪生数如下");
		for (i=0; i<n-1; i++){
			if (a[i+1]-a[i]==2){
				System.out.print(a[i]+"  ");
				System.out.print(a[i+1]+"  ");
				System.out.println();
			}
		}
	}
}
