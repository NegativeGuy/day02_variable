package day02_variable;

import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) throws IOException {
		int val;
		System.out.println("입력 : ");
		val = System.in.read();
		System.out.println("입력 data : "+(char)val);
		
		System.in.read();		// 두번 이상의 입력을 받으려면 가운데 잔여데이터를 
		System.in.read();		// 제거해줄 빈 코드를 넣어줘야함
		
		System.out.println("두번째 입력 : ");
		val = System.in.read();
		System.out.println("입력 data : "+(char)val);
		
	}
}
