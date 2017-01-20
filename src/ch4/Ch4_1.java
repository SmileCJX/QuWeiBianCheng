package ch4;

public class Ch4_1 {
	public static boolean isPrimeNumber(int number){
		boolean flag = true;
		if (number <=0){
			throw new IllegalArgumentException("number是不合法的参数!");
		}
		
		for (int i=2; i<=Math.sqrt(number); i++){
			if (number%i==0){
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		System.out.println("100以内素数如下");
		int count = 0;
		for (int i=2; i<100; i++){
			if (isPrimeNumber(i)==true){
				System.out.print(i+"  ");
				count++;
				if (count % 10 ==0){
					System.out.println();
				}
			}
		}
	}
}
