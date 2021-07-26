package day02_variable;

public class Ex04 {
	public static void main(String[] args) {
		char ch = 'A';
		int num = 5, ret;
		
		ret = ch + num;
		// A는 아스키코드에서 65 거기에 5를 더함
		System.out.println("ret = "+ret);	//70		
		System.out.println("ret = "+(char)ret);	//70은 아스키코드에서 F
	}
}
