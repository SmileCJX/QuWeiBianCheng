package ch6;
//猴子分桃
public class Ch6_8 {
	public static void main(String[] args) {
		int j;
		for (int i=0; i<10000; i++){
			int count = i;
			for (j=0; j<5; j++){
				if ((count-1)%5==0){
					count = (count-1)/5*4;
				}else{
					break;
				}
			}
			if (j==5){
				System.out.println("原来可能有桃子"+i+"个");
			}
		}
		System.out.println("程序结束");
	}
}
