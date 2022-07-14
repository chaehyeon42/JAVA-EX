package method;

/*
 import java.util.Scanner;

 import Caculator.Caculator;
//
 public class Calculatortest {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);		//키보드로 입력할 수 있게 설정
		Calculator cal = new Calculator();		//인스턴스 생성
//		
//		System.out.println("연산하고자 하는 두 정수값과 연산자를 입력하세요.>");
//		
//		int a = s.nextInt();
//		String op = s.next();
//		int b = s.nextInt();
//		
//		System.out.println(cal.getAdd(7,3));
//		System.out.println(cal.getSub(7,3));
//		System.out.println(cal.getMul(7,3));
//		System.out.println(cal.getDiv(7,3));
//	}
//}
//*/
import java.util.Scanner;

public class Calculatortest{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);		//키보드로 입력할 수 있게 설정
		Calculator cal = new Calculator();
		
		int a = s.nextInt();
		String op = s.next();
		int b = s.nextInt();
		
		System.out.println(cal.method (a, b));
		System.out.println(cal.method (a, b));
		System.out.println(cal.method (a, b));
		System.out.println(cal.method (a, b));
	}
}