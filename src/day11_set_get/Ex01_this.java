package day11_set_get;

public class Ex01_this {
	public int a =10;//������ �ٱ��� �ִ°��� ����
	public void func01() {
		int a = 12345;//�ȿ� �ִ� �ڽź��� ����
		//1.�̷��Ծ���
		System.out.println("01 a : " +this.a);
		System.out.println("this : " +this);
		
		//2.�̷��Ծ��� ����� ����
		this.func02();
		func02();
	}
	
	public void func02() {
		System.out.println("02 a : " +a);
	}
}
