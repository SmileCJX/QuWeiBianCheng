package ch6;
//���ӷ���
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
				System.out.println("ԭ������������"+i+"��");
			}
		}
		System.out.println("�������");
	}
}
