package day11_set_get;

public class Ex01_MainClass {
	public static void main(String[] args) {
		/*
		 this�� Ŭ���� �ڱ� �ڽ��� ��ġ ������ ������ �ִ�
		 ��� �޼ҵ带 ����� �ڵ������� �����ȴ�
		 */
		
		Ex01_this ex = new Ex01_this();
		//Ex01_this ex01 = ex;
		System.out.println("ex : " +ex);
		//System.out.println("ex01 : " + ex01);
		//ex.a =7777;//.�� ��� ���� ������, �ٱ��� a�� ���ڴ�
		
		ex.func01(); 
		ex.func02();
		//ex01.func02();
		
		
	}
}


