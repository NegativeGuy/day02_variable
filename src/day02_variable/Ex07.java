package day02_variable;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age;
		String name;
		
		System.out.println("�̸� �Է� : ");
		name = input.next();	// .next() = ���ڿ� �Է¹޴� ��ɾ�
		
		System.out.println("���� �Է� : ");
		age = input.nextInt();	// .nextInt() = int(����)�� ������ �Է¹޴� ��ɾ�
		
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
	}
}
