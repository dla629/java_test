package chapter04;

public class PIf04 {

	public static void main(String[] args) {
		int score = 82;
		char grade;
		
		if(score > 100) {
			grade = 'x';
		}else if(score >= 90) {
			grade = 'A';
		}else if(score >= 80) {
			grade = 'B';
		}else if(score >= 70) {
			grade = 'C';
		}else if(score >= 60) {
			grade = 'D';
		}else {
			grade ='F';
		}
		System.out.println("����� ������ " + score + "�� �Դϴ�. = ���� ������ " + grade + "�Դϴ�.");
	}

}
