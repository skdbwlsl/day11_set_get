package day11_set_get;

import java.util.Scanner;

public class quiz_Mainclass {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int num=0, result=0;  String id = null, pw =null;
		Login lo = new Login(); boolean flag=true;
		
		while(flag) {
			System.out.println("1.�α���\t 2.����\t 3.�α׾ƿ�");
			System.out.println(">>>");
			num = input.nextInt();
			
		
			switch(num) {
			case 1 : 
				System.out.println("���̵� �Է� : ");
				id = input.next();
				System.out.println("��й�ȣ �Է�: ");
				pw = input.next();
				result = lo.compare(id, pw);
				if(result==0) {
					System.out.println("���� ���");
				}else
					System.out.println("���� ����");break;
			
			case 2 :
				System.out.println("���� id : ");
				id  =input.next();
				System.out.println("���� pw : ");
				pw = input.next();
				lo.setUserId(id);
				lo.setUserPw(pw);
				System.out.println("���� �Ϸ�");break;
			
			case 3 ://flag =lo.out();
				System.out.println("����");	
				System.exit(0);
					
				
				
				
			
			}
		}
	}
}



