package AccessModefile;

public class PeopleTest {

	public static void main(String[] args) {
			/*
			Women w = new Women();
			Man m = new Man();
			w.printInfo();
			m.printInfo();
			*/
		//다형성
		//부모클래스 호출
		//People이라는 하나의 클래스로 두개의 참조형 변수를 호출함(=다형성)
		//부모클래스가 자식 클래스보다 크므로 이는 자동형변환이 된것이다
		//people 참조타입 p 로 man 클래스 참조
		People p = new Man();
		p.printInfo();
		//enlist()메서드 호출안됨
		//참조형 변수 p는 people타입이고 people클래스에는 enlist 메소드를 가지고 있지 않기 때문에 안됨 이것을 사용하려면 강제 형변환을 해줘야 함 
		((Man)p).enlist();
		
		//people 참조타입 p로 Women 클래스 참조
		p = new Women(); 
		p.printInfo();
		// makeup()메서드 호출안됨
		((Women)p).makeup();
	}


}
