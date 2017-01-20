package ch3;


public class Ch3_7 {
	public static void main(String[] args){
		for (int i=1; i<10000; i++){
			ziShouShu(i);
		}
	}
	
	public static void ziShouShu(int n){
		String strI = String.valueOf(n);
		
		String multiStr = String.valueOf(n*n);
		
		String last = multiStr.substring(multiStr.length()-strI.length(),multiStr.length());
		
		if (last.equals(strI)){
			System.out.println(n + "*" + n + "=" + multiStr + "-->" + n*n + "ÊÇ×ÔÊØÊı");
		}
	}
}
