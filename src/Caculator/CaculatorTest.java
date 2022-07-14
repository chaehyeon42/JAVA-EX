package Caculator;

//main 메서드에서 add 함수에 10과 20을 호출
//1. 두 수를 더할수 있도록 작성해보자
// void add(int num1, int num2)앞에 static이 없기 때문에 인스턴스 함수임

public class CaculatorTest {

	public static void main(String[] args) {
		Caculator cal = new Caculator();
		
		/*return 없이 출력
		cal.add(10, 20);
		*/
		System.out.println(cal.add(10, 20));		//return을 해줘서 여기에 30이라는 값이 저장되어 출력문을 입력 해줘야함
	}
}
