
public class Main01 { //�ݺ��Լ��� ����Լ� - �Ǻ���ġ ����
	
	public static int fibonacci(int number) {
		int one = 1;
		int two = 2;
		int result = -1;
		if(number == 1) {
			return one;
		}
		else if(number == 2 ) {
			return two;
		}
		else {
			for(int i = 2; i < number; i++) {
				result = one + two;
				one = two;
				two = result;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("�Ǻ���ġ ������ ����° ���Ҵ�" + fibonacci(10)  );

	}

}
