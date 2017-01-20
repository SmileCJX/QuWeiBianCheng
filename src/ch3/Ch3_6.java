package ch3;


public class Ch3_6 {
	public static void main(String[] args){
		long begin = System.currentTimeMillis();
		getGouguNum(1000);
		long end = System.currentTimeMillis();
		System.out.println("ºÄÊ±"+(end - begin)+"ms");
	}
	
	public static final void getGouguNum(int maxnum){
		for (int i= 1; i<maxnum; i++){
			for (int j=i+1; j<maxnum; j++){
				for (int n=j+1; n<maxnum; n++){
					if ((i*i+j*j)==n*n){
						System.out.println(" " +i+ " "+j+" "+n);
					}
				}
			}
		}
	}
}
