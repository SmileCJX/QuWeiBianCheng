package ch4;
/*
 * ������ѧ��÷ɭ�����������2^n-1�������ر����Ȥ����������������Ĺ��������˾ͰѴ���������Ϊ÷ɭ����
 * �Ѿ�֤���ˣ����2^n-1������������ָ��n����Ϊ������Ȼ���������������ԣ���nʱ����ʱ,2^n-1��һ�������������磬�����Ѿ��ҵ���
 * 2^11-1��һ��������23���Գ�������2^23-1��һ��������47���Գ�����
 */
public class Ch4_7 {
	public static void main(String[] args) {
		double t,m;
		int j,n;
		int count;
		count = 0;//Ӌ�r��
		t = 2;
		
		for (n=2; n<=50; n++){//ָ����Χ
			t = t*2;//�۳���
			m = t - 1;
			int x = 0;//xΪ0��������������Ϊ1��������������
			for (j = 3; j<Math.sqrt(m)+1; j+=2){
				if (m%j==0){
					x =1;
					break;
				}
			}
			if (x == 0){
				count++;
				System.out.println(n+"*"+n+"-1="+m);
			}
		}
		System.out.println("ָ��n�ڡ�2,50����÷ɭ��������"+count+"��");
	}
}