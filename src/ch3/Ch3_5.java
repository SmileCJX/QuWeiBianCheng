package ch3;

import java.util.Arrays;
public class Ch3_5 {
	public static void main(String[] args){
		for (int input = 1000; input <= 9999; input++){
			System.out.println("\n"+input+"��֤���£�");
			if (input % 1111 == 0){
				System.out.println("����ȫ����ͬ!");
				continue;
			}
			else{
				int flag = 0;
				int input2 = input;
				do{
					input2 = he(fen(input2));
					flag++;
				}while(input2 != 6174);
				
				if (input2 == 6174){
					System.out.println("������"+flag+"��, "+"����Ϊ�棡");
				}
				else{
					System.out.println("����Ϊ�٣�");
				}
			}
		}
		System.out.println("���������");
	}
	
	public static int [] fen(int input){
		int a[] = new int[4];
		a[0] = input / 1000;
		a[1] = input % 1000 /100;
		a[2] = input % 100 /10;
		a[3] = input % 10;
		Arrays.sort(a);
		return a;
	}
	
	public static int he(int a[]){
		//Arrays.sort(a);
		int max = a[3]*1000+a[2]*100+a[1]*10+a[0];
		int min = a[0]*1000+a[1]*100+a[2]*10+a[3];
		System.out.println(max+"-"+min+"="+(max-min));
		return max-min;
	}
}
