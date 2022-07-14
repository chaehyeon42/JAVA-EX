package variable;

public class casting {
	public static void main(String[] args) {
		int a = 85;			//'='은 대입연산자로 85의 타입(int)과 a라는 변수(int)의 타입이 일치 하기 때문에 연산을 하게됨
		
		//byte b = a; 		//int타입을  byte타입으로 변환   ->타입이 일치 하지 않기 때문에 불가 	=>강제 형변환에 속함-데이터 손실 발생
		byte b = (byte)a;    //형변환 방법:(변환하고자 하는 타입)변수명;		
		
		//byte타입을 int타입으로 변환
		b = 10;
		a = b;			//b는 byte타입이고 a는 int타입인데 byte타입을 int타입으로 변환 =>자동 형변환에 속함-작은쪽에서 큰쪽으로 변환되는 것(데이터 손실이 안일어남)
		
		
		float c = a;   		//int 타입을 float 타입으로 변환
	  	//a = c;				//float 타입을 int타입으로 변환 ->데이터 손실 발생하여 불가 (실수가 정수보다 더 크다) - 같은 byte지만 float이 int보다 더 크며 강제 형변환 할 경우 소수점이 잘린다
		a = (int)c;				
	
	}
}
