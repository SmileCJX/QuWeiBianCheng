package ch5;
//��Ǯ�ټ�
public class Ch5_1 {
	public static void BQBJ(int m,int n){
		int x,y,z;
		for (x=0; x<=n; x++){
			for (y=0; y<=n; y++){
				z = n-x-y;
				if (z>0 && z%3==0 && (x*5+y*3+z/3==m)){
					System.out.println("������"+x+"  ĸ����"+y+"  С����"+z);
				}else{
					;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int m,n;
		m = 100;
		n = 100;
		System.out.println(m+"Ǯ"+n+"��"+"��������Ϊ:");
		BQBJ(m,n);
	}
}
