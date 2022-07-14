package Object;

public class Tiretest {

	public static void main(String[] args) {			//ststic이 붙여짐으로써 메서드 main은 클랴스 메서드 즉, 공유 메서드가 됨 
		// 앞(front) 왼쪽(left) 타이어
		Tire fl = new Tire();     				//fl:참조형 변수
		fl.kyung=20;
		
		System.out.println(fl.kyung);
		//앞(front) 오른쪽(right) 타이어
		Tire fr = new Tire();    
		System.out.println(fr.kyung);			//위 와는 또다른 주소이기때문에 위에서 값이 변한다 하더라도 똑같이 변하거나 하지는 않는다
		//뒤(back) 왼쪽(left) 타이어
		Tire bl = new Tire();     
		 //뒤(back) 오른쪽(right) 타이어
		Tire br = new Tire();     
	}

}


//int a = 10; (a: 기본형 변수)-값을 저장(정수만 저장)
//Tire fl = new Tire( ); (fl: 참조형 변수-클래스에 있는 것만 저장)-주소를 저장(큰 데이터를 다룰수록 주소를 저장)
//			new라는 키워드는 클래스에 새로운 주소를 만드는 키워드(new + 클래스 명)
//Tire은 타입 fl은 변수명 
