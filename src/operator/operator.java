package operator;

public class operator {
	public static void main(String[] args) {
		//산술 연산자(+,-,*,/,%)
		//비교 연산자(<,>,<=,>=,==,!=)
		//논리 연산자(&&,||,!) - &&과 ||가 같이 있으면 ||부터 먼저  비교
		//대입 연산자(=,+=,-=,*=,/=,%=)
		//삼항 연산자(조건식 ? 참 : 거짓 ->if 대신 사용하는 조건문) 	=>?와 : 이 연산자 이고 조건식, 참, 거짓은 피연산자 이므로 이를 삼항연산자라 부름(피연산자 갯수에 따라 달라짐  피연산자가 하나면 단항 연산자,두개면 이항연산자 이런식으로 나뉨)
		/*
		 * 
		 */
	 	/*1번
		int apple=123;			//사과를 저장하는 변수
		int basket=10;			//한 바구니 당 사과수를 저장하는 변수
		System.out.println(apple/basket+1);
		//System.out.println(apple / basket + ( apple % basket ==0 ? 0 : 1 ));  	->만약 120/10과 123/10을 동시에 적을때의 코드	(삼항연산자 이용)
		*/
		
		//2번
		/*
		int num=0;
		System.out.println(num<0?"음수": num>0?"양수": 0);
		*/
		
		//3번
		/*
			byte a = 10;
			byte b = 20;
			byte c =(byte)(a + b);				//a+b는 이항 연산자(자바에서는 연산을 할 때 int보다 작은 타입들은 int로 변환 해야함 - byte, short등/이항연산자 일때만)
				
			char ch = 'A';
			ch = (char)(ch + 2);				//타입을 일치시켜줘야함
				
			float f = 3/2f;						
			long l =3000 * 3000 * 3000L;		//L을 붙이지 않으면 오버플로우 현상이 일어나서 값이 나오지 않는다
			float f2 = 0.1f;
			double d = 0.1;
				
			boolean result = (float)d==f2;
				
			System.out.println("c="+c);
			System.out.println("ch="+ch);
			System.out.println("f="+f);
			System.out.println("l="+l);
			System.out.println("result="+result);
		*/
		//4번
		char ch = 'z'; 																								//문자를 저장하는 ch 변수를 선언
		boolean b =(ch >= 65 && ch <= 90 ) || (ch >= 97 && ch <= 122) || (ch >= 48 && ch <= 57) ? true:false;				//boolean: true, false 값을 내야 하기 때문에 사용(b변수를 선언) //아스키코드 이용
					//대문자조건 표현 				//소문자조건 표현				//숫자조건 표현				
		System.out.println(b);
	
	}
}	
		
		
		
		

