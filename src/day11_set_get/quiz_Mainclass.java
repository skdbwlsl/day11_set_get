package day11_set_get;

import java.util.Scanner;

public class quiz_Mainclass {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int num=0, result=0;  String id = null, pw =null;
		Login lo = new Login(); boolean flag=true;
		
		while(flag) {
			System.out.println("1.로그인\t 2.가입\t 3.로그아웃");
			System.out.println(">>>");
			num = input.nextInt();
			
		
			switch(num) {
			case 1 : 
				System.out.println("아이디 입력 : ");
				id = input.next();
				System.out.println("비밀번호 입력: ");
				pw = input.next();
				result = lo.compare(id, pw);
				if(result==0) {
					System.out.println("인증 통과");
				}else
					System.out.println("인증 실패");break;
			
			case 2 :
				System.out.println("가입 id : ");
				id  =input.next();
				System.out.println("가입 pw : ");
				pw = input.next();
				lo.setUserId(id);
				lo.setUserPw(pw);
				System.out.println("저장 완료");break;
			
			case 3 ://flag =lo.out();
				System.out.println("종료");	
				System.exit(0);
					
				
				
				
			
			}
		}
	}
}



