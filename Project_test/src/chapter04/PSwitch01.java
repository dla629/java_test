package chapter04;

public class PSwitch01 {

	public static void main(String[] args) {
		String medal = "g";
		
		switch(medal) {
		case "Gold": case "G": case "g": case "Gol":
			System.out.println("�ݸ޴� �Դϴ�.");
			break;
			
		case "Silver": case "S": case "s": case "Sil":
			System.out.println("���޴� �Դϴ�.");
			break;
		
		case "Bronze": case "B": case "b": case "Bro":
			System.out.println("���޴� �Դϴ�");
			break;
			
		default :
			System.out.println("�޴��� ȹ������ ���߽��ϴ�.");
			break;
			
		}

	}

}
