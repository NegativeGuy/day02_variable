package day02_variable;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age;
		String name;
		
		System.out.println("이름 입력 : ");
		name = input.next();	// .next() = 문자열 입력받는 명령어
		
		System.out.println("나이 입력 : ");
		age = input.nextInt();	// .nextInt() = int(정수)형 데이터 입력받는 명령어
		
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
}
