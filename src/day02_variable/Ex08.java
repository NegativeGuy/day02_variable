package day02_variable;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String n1, n2;
		System.out.println("첫번째 값 입력 : ");
		n1 = input.next();
		System.out.println("두번째 값 입력 : ");
		n2 = input.next();		// 띄어쓰기 불가능
		//n2 = input.nextLine();    띄어쓰기 가능
		System.out.println("첫번째 입력 값 : "+n1);
		System.out.println("두번째 입력 값 : "+n2);
	}
}
