
public class Main implements Dog, Cat {	// extends�� ������� �ʴ´�.
// ���� �� ���� class�� ���� �� �ִ� ������ �ִ�. (extends�� ���� �߻�)
	
	public static void main(String[] args) {
		Main main = new Main();
		main.crying();
		main.one();
		main.two();
		
	}


	@Override
	public void two() {
		System.out.println("��~��~�� ^^");
		
	}

	@Override
	public void one() {
		System.out.println("ī��!!!!! -_-+");
		
	}


	@Override
	public void crying() {
		System.out.println("HELLO FXCK");
		
	}

}
