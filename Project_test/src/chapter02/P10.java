package chapter02;

public class P10 {

	public static void main(String[] args) {
		double a = 1;

		for (int i = 0; i < 10000; i++) {

			a = a + 0.1;
		}

		System.out.println(a);// ��ó�� �ε� �Ҽ��� ����� 0�� ǥ���� ���� ������ ������ ����

	}
}