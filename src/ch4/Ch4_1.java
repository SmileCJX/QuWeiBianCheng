package ch4;

public class Ch4_1 {
	public static boolean isPrimeNumber(int number){
		boolean flag = true;
		if (number <=0){
			throw new IllegalArgumentException("number�ǲ��Ϸ��Ĳ���!");
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
		System.out.println("100������������");
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
