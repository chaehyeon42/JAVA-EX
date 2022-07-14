package method;
/*
 * 다음과 같은 멤버변수(인스턴스변수와 클래스변수를 통칭한것)를 갖는 SutdaCard클래스를 정의 하시오
 * 
 * int num 카드의 숫자.(1~10사이의 정수)
 * 
 * boolean isKwang 광이면 true 아니면 false
 */

public class SutdaCard {
		// int num 카드의 숫자.(1~10사이의 정수)
		int num;
		//boolean isKwang 광이면 true 아니면 false
		boolean isKwang;
		
		//생성자 문법: 클래스명(){}
		SutdaCard(){			//->매개변수가 없는 생성자 선언(기본생성자)
			this(1,true);		//this( ) 다른 생성자 호출(card 1)						
		}
		SutdaCard(int num, boolean isKwang){		//->매개변수가 두개인 생성자 선언
			this.num =num;			//인스턴스 변수를 가리킴	
			this.isKwang=isKwang;
		}
		
		String info() {						//void를 사용할 경우는 출력하는 코드를 Void 안에 넣어야함(리턴을 사용하지 않을 경우 사용)
			return num+(isKwang?"K":"");	//삼항연산자
		}
}
