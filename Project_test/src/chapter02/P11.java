package chapter02;

public class P11 {

	public static void main(String[] args) {
		double a = 1.2;
		float b = 0.9F;
		
		int c = (int)(a + b);    //�� �Ǽ��� ������ ����ȯ �Ͽ� �Ҽ��� ���� ���ڸ� ����
		int d = (int)a + (int)b; //������ �Ǽ��� ����ȯ �� ���� ������ �Ҽ����� ����ȯ�� ����
		
		System.out.println(c);
		System.out.println(d);
		
		int e = 10;
		double f = 2.0;
		
		System.out.println((int)(e + f));
		System.out.println((int)(e - f));
		System.out.println((int)(e * f));
		System.out.println((int)(e / f));
		

	}

}
