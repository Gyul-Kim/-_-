
public class Main {

	public static void main(String[] args) {
		
		Archer archer1 = new Archer("�û�1", "��");
		Archer archer2 = new Archer("����ȭ��", "�ֻ�");
		System.out.println(archer1== archer2);
		System.out.println(archer1.equals(archer2));
	}

}
