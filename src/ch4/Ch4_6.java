package ch4;
/*
 * ������ƽ���ǻ��ģ�����11*11=121���󲻳���1000�Ļ�������
 * 
 */
public class Ch4_6 {
	public static void main(String[] args) {
		System.out.println("1000���ڵ�ƽ��������������");
		for (int i=2; i<1000; i++){
			if (prime(i)==1 && pa(i*i)==1){
				System.out.println(i+"*"+i+"="+i*i);
			}
		}
	}
	public static int prime(int a){
		//ѭ������
		for (int i=2; i<=Math.sqrt(a); i++){
			//������������
			if (a % i ==0){
				return 0;
			}
		}
		return 1;
	}
	
	public static String trans(int bk){
		int a = bk;
		//��ʼ��
		String res = "";
		//ѭ������ֱ��Ϊ0
		while(a !=0){
			int b = a % 10;//ȡ���λ
			res = b + res;//ת��Ϊ�ַ���
			a = a / 10;//ȥ�����λ
		}
		return res;
	}
	
	public static int pa(int a){
		String str= trans(a);//����aת��Ϊ�ַ���
		int ls = str.length();//ȡ���ַ�������
		for (int i=0; i<ls; i++){
			if(str.codePointAt(i)!=str.codePointAt(ls-1-i)){//��λ�ԳƱȽ�
				return 0;
			}
		}
		return 1;
	}
	
	
}
