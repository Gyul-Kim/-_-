
public class Main01 {

	public static void main(String[] args) {
		String a = "Man";
		int b = 0;
		
		// java�� String �񱳽� equal()�� �̿��Ѵ�.
		// String�� �ٸ� �ڹ����� �ٸ� ���ڿ� �ڷ����̱� �����̴�.
		
		if(a.equals("Man")) {
			System.out.println("�����Դϴ�.");
		}
		else {
			System.out.println("���ڰ� �ƴϴ�.");
		}
		
		if(b==3) {
			System.out.println("b�� 3�Դϴ�.");
		}
		else {
			System.out.println("b�� 3�� �ƴϴ�.");
		}
		
		if(a.equalsIgnoreCase("man") && b ==0) {
			System.out.println("��.");
		}
		else {
			System.out.println("����.");
		}

	}

}
