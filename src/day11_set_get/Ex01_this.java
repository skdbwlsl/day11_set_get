package day11_set_get;

public class Ex01_this {
	public int a =10;//없으면 바깥에 있는것을 쓴다
	public void func01() {
		int a = 12345;//안에 있는 자신부터 쓰고
		//1.이렇게쓰나
		System.out.println("01 a : " +this.a);
		System.out.println("this : " +this);
		
		//2.이렇게쓰나 결과는 동일
		this.func02();
		func02();
	}
	
	public void func02() {
		System.out.println("02 a : " +a);
	}
}
