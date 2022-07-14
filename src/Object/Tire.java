package Object;

public class Tire {
//Tire라는 변수안에 들어가있는것이 모두 전역변수(전역변수안에 두가지로 나뉨)
	
/*
 속성(변수이름)
 총 폭(width) : 205
 림 경(kyung): 15
 편평비(ratio) : 75
 */
	
int width=205;
static int kyung=15;
int ratio=75;

//위 변수들은 공유를 안하기 때문에 인스턴스 변수이다
//인스턴스변수를 클래스 변수로 만들기 위해서는 타입 앞에 static이라는 키워드를 붙여주면 바뀌게 된다.
//즉, width와 ratio는 static이라는 키워드가 없기 때문에 인스턴스 변수이며 kyung은 키워드가 붙었기에 클래스 변수이다.
//클래스 변수는 클래스이름.클래스 변수 로 작성가능 
//클래스 변수는 참조형 변수로 접근이 가능


/*
	  	메서드(함수)
	  	하중(weight)을 지탱하는 기능
	  	진행방향을 전환(transform)하는 기능
	  	노면으로부터 충격을 완화(ease)하는 기능
	
 */
	//함수 선언
	static void weight(int a, int b){		//함수(메서드)
		int c=10; 		//지역변수	
		System.out.println("하중(weigth)을 지탱하는 기능");				//리턴이 없기 때문에 void를 사용
	}
	static void transform(int c) {			//함수(메서드)
		System.out.println("진행방향을 전환(transform)하는 기능");		    //리턴이 없기 때문에 void를 사용
	}
	static void ease(float d) {			//함수(메서드)
		System.out.println("노면으로부터 충격을 완화(ease)하는 기능");		//리턴이 없기 때문에 void를 사용
	}
		
	
}