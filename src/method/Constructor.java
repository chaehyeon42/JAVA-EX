package method;

//생성자(인스턴스변수를 초기화 시키는 메서드)
public class Constructor {
		
		//(전역변수)
		//인스턴스 변수
		int a;
		//인스턴스 변수
		int b;
		//인스턴스 변수
		int c;
		//기본생성자(매개변수가 없는 생성자)
		//this():다른 생성자를 호출하는 것 
		Constructor(){
			this(10,20,30);
		}
		//클래스명(){} : 생성자 선언
		Constructor(int a, int b, int c){
			//인스턴스 변수 a =매개변수 a
			//this.은 인스턴스 변수임 
			this.a = a;				//this.은 자기자신이라는 뜻이므로 자신에게 있는 변수를 가르킨다(같은 변수명이 있을대 차별점을 가지기 위해 사용)-전역변수를 가르킴
			this.b = b;
			this.c = c;
			
		}
	
}
