package day11_set_get;

public class Ex01_MainClass {
	public static void main(String[] args) {
		/*
		 this는 클래스 자기 자신의 위치 정보를 가지고 있다
		 멤버 메소드를 만들면 자동적으로 생성된다
		 */
		
		Ex01_this ex = new Ex01_this();
		//Ex01_this ex01 = ex;
		System.out.println("ex : " +ex);
		//System.out.println("ex01 : " + ex01);
		//ex.a =7777;//.은 멤버 접근 연산자, 바깥쪽 a를 쓰겠다
		
		ex.func01(); 
		ex.func02();
		//ex01.func02();
		
		
	}
}


