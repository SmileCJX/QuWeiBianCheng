package ch2;

//Ѱ�����³���
public class Ch2_5 {
	public static void main(String[] args) {
		int t;

		for (int i = 1; i <= 9; i++)
			for (int j = 0; j <= 9; j++) {
				t = 1100 * i + 11 * j;
				for (int k = 30; k <= 100; k++) {
					if (k == Math.sqrt(t)) {
						System.out.println("��������Ϊ:" + t);
					}
				}
			}
	}
}
