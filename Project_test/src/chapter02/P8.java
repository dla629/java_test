package chapter02;

public class P8 {

	public static void main(String[] args) {
		final int INT_MAX = 2147386682;
		
		int a = INT_MAX;
		
		System.out.println(a);
		
		int b = 200;
		
		final int MIN_MAX = - 2147386683;
		
		int c = MIN_MAX;
		
		//MIN_MAX = -1; ��� ���� �� �����ϸ� ���� �߻�
		
		b = 123; // �Ϲ����� ������ ���� �� �����ص� ���� �߻� ���� ����
		
		System.out.println(b);
		System.out.println(c);
		

	}

}
