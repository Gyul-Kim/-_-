
public class Main {

	public static void main(String[] args) {
		
		Hero[] heros = new Hero[3];
		heros[0] = new ScarletWitch("��Į�� ��ġ");
		heros[1] = new SpiderMen("�����̴���");
		heros[2] = new Thor("�丣");
		
		for(int i = 0; i < heros.length; i++) {
			heros[i].attack();
			
			if(heros[i] instanceof ScarletWitch) {
				ScarletWitch temp = (ScarletWitch) heros[i];
				temp.Realitymanipulation();
			}
			else if(heros[i] instanceof SpiderMen) {
				SpiderMen temp = (SpiderMen) heros[i];
				temp.WebShot();
			}
			else if(heros[i] instanceof Thor) {
				Thor temp = (Thor) heros[i];
				temp.StormBreaker();
			}
		}

	}

}
