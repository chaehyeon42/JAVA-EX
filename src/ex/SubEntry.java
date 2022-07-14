package ex;

//자식클래스			
					 //Entry를 상속받음
public class SubEntry extends Entry {
		//속성
		String definition;			//인스턴스 변수(원어 저장)
		int year;					//인스턴스 변수(시기 저장)
		
		//메서드 종류 즁에서 생성자
			SubEntry(String w){			//매개변수가 하나인 생성자
				super(); 	//Entry에 있는 기본생성자를 상속받을수 있다(기본생성자가 있으면 자동으로 만들어지지만 없으면 따로 만들어줘야함)
				word=w;
		}		
		SubEntry(String w,String d,int y){		//매개변수가 세개인 생성자
			this(w);
			definition=d;
			year=y;
		}		
		
		//메서드(매개변수가 없고 리턴도 없는 인스턴스 메서드)
		public void printView() {		//원어,시기출력
			System.out.println("원어:"+definition);
			System.out.println("시기:"+year+"년");
		}
}
