package day02_variable;

import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) throws IOException {
		int val;
		System.out.println("�Է� : ");
		val = System.in.read();
		System.out.println("�Է� data : "+(char)val);
		
		System.in.read();		// �ι� �̻��� �Է��� �������� ��� �ܿ������͸� 
		System.in.read();		// �������� �� �ڵ带 �־������
		
		System.out.println("�ι�° �Է� : ");
		val = System.in.read();
		System.out.println("�Է� data : "+(char)val);
		
	}
}
