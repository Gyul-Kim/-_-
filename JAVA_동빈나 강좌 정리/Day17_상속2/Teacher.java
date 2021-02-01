
public class Teacher extends Person{

	private String teacehrID;
	private int monthSalary;
	private int worekdYear;
	public String getteacehrID() {
		return teacehrID;
	}
	public void setTeacehrID(String teacehrID) {
		this.teacehrID = teacehrID;
	}
	public int getMonthSalary() {
		return monthSalary;
	}
	public void setMonthSalary(int monthSalary) {
		this.monthSalary = monthSalary;
	}
	public int getWorekdYear() {
		return worekdYear;
	}
	public void setWorekdYear(int worekdYear) {
		this.worekdYear = worekdYear;
	}
	public Teacher(String name, int age, int height, int weight, String teacehrID, int monthSalary, int worekdYear) {
		super(name, age, height, weight);
		this.teacehrID = teacehrID;
		this.monthSalary = monthSalary;
		this.worekdYear = worekdYear;
	}
	
	public void show() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("���� �̸� : " + getName());
		System.out.println("���� ���� : " + getAge());
		System.out.println("���� Ű : " + getHeight());
		System.out.println("���� ������ : " + getWeight());
		System.out.println("���� ��ȣ : " + getteacehrID());
		System.out.println("���� ����: " + getMonthSalary());
		System.out.println("���� ����: " + getWorekdYear());	
	}
}
