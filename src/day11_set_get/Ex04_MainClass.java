package day11_set_get;

import java.util.Scanner;

public class Ex04_MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int age;
		System.out.println("�̸� �Է� "); name = input.next();
		System.out.println("���� �Է� "); age = input.nextInt();
		//��ü ���� �� setter�� ���� ������ ���� ����
		Ex04_set_get ex = new Ex04_set_get();
		ex.setName(name);
		ex.setAge(age);
		//���̸� ������ ����ϴ� �޼ҵ� ���� �� age����
		//����� ���� getter�� ���� main���� ���
		//??���� ���̴� ??�� �Դϴ�
		System.out.println(ex.getName()+"���� ���̴� "+ex.getAge()+"�� �Դϴ�");
		
		
		
	}

}
