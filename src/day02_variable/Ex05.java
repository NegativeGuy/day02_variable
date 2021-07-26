package day02_variable;

public class Ex05 {
	public static void main(String[] args) {
		final int i = 100;	//final을 자료형 앞에 써주면 '변수'를 '상수'로 바꿈
		//i = 200;
		System.out.println(i);
		
		final String KOREA = "대한민국"; //상수명은 항상 대문자로 표기, 문자열은 ""로 묶어줌
		//KOREA = "미국";
		System.out.println(KOREA);
	}
}
