package method;
/*
 * 1. 다음과 같은 멤버변수를 갖는 Calculator클래스를 정의한 후
	다음과 같이 정의된 네 개의 메서드getAdd(), getSub(), getMul(), getDiv()를 추가하여 임의의 정수와
	연산자를키보드로 입력 받아서 처리 될 수 있게 CalculatorTest클래스를 완성하시오.(각 변수의 초기화는 임의의 값 설정)

public class Calculator {
			
			int getAdd(int a, int b) {
				return a + b;
			}
			
			int getSub(int a, int b) {
				return a - b;
			}
			
			int getMul(int a, int b) {
				return a * b;
			}
			
			float getDiv(int a, int b) {
				return a/b;
			}
			
}
 */


/*2. 다음과 같은 멤버변수를 갖는 Calculator클래스를 정의한 후
	다음과 같이 정의된 하나의 메서드(cal())만으로 임의의 정수와
	연산자를키보드로 입력 받아서 처리 될 수 있게 CalculatorTest클래스를 완성하시오.(각 변수의 초기화는 임의의 값 설정)
	Cal() 메소드는 덧셈,뺄셈,곱셈,나눗셈 계산하는 메소드
*/

public class Calculator {
	static int method (int a, int b) {
		return a + b;
	}
	
	double method(int a, double b) {
		return a - b;
	}
	
	double method (double a, int b) {
		return a * b;
	}
	
	double method (double a, double b) {
		return a/b;
	}
	
}















