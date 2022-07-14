package method;

public class Construction {

	public static void main(String[] args) {
		//생성자를 이용한 초기화(생성자 호출)
		//Constructor c= new Constructor(10,20,30);			// Constructor c : 인스턴스 생성
															//Constructor(10,20,30) : 생성자 호출
		/*명시적 초기화
		//Constructor클래스에 있는 a변수에 10 초기화
		c.a=10;
		//Constructor클래스에 있는 b변수에 20 초기화
		c.b=20;
		//Constructor클래스에 있는 c변수에 30 초기화
		c.c=30;
		*/
	
//명시적 초기화 보다 생성자를 이용한 초기화의 소스가 더 간단함
	
		/*
		Constructor c1= new Constructor(10,20,30);
		Constructor c2= new Constructor(40,50,60);
		Constructor c3= new Constructor(70,80,90);
		*/
		Constructor c4= new Constructor();
	}
}