package chapter04;

public class PIf06 {

	public static void main(String[] args) {
		String medal = "s";
		
		if(medal == "1" || medal =="Gold" || medal == "G" || medal == "g" || medal == "Gol") {
			System.out.println("�ݸ޴� �Դϴ�.");
		}else if(medal == "2"||medal =="Silver"||medal == "S"||medal == "s"|| medal =="Sil") {
			System.out.println("���޴� �Դϴ�.");
		}else if(medal == "3"||medal =="Bronze"||medal == "B"||medal == "b"|| medal =="Bro") {
			System.out.println("���޴� �Դϴ�.");
		}else {
			System.out.println("�޴��� ȹ������ ���߽��ϴ�.");
		}

	}

}
