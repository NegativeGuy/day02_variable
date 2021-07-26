package day02_variable;

public class Quiz01 {
	public static void main(String[] args) {
		// 형변환 이용하는 문제
		byte b = 97;
		short s = 20;
		char c = 'A';
		float f;
		s = b;
		c = (char)b;
		s = (short)c;
		c = (char)s;
		f = (float)5.11; // 5.11f로 써도 됨
	}
}
