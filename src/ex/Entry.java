/*
 * 1. 다음 프로그램을 완성하시오
(1)부모클래스 : Entry
   필드명 : String word;
   메소드 : Entry();
            Entry(String w);                       
            public void printView();               //약어출력
(2)자식클래스 : SubEntry   (Entry를 상속받음)
   필드명 : String definition; 
            int year;
   메소드 : SubEntry(String w);                 
            SubEntry(String w, String d, int y);  //SubEntry(String w)호출
            public void printView();              //원어, 시기출력
(3)main()함수가 있는 클래스에서
    new SubEntry("OOP","Object Oriented Programming", 1991);
(4)출력
 */


package ex;

//부모클래스
public class Entry {
		//속성
		String word;		//인스턴스 변수(약어저장)-static이 없기 때문에 인스턴스 변수가 됨
		
		//메서드 종류 중에서 생성자에 속함
		Entry( ){};			//매개변수가 없는 생성자(기본생성자)
		Entry(String w){	//매개변수가 하나인 생성자
			word=w;
		}
		//메서드(매개변수가 없고 리턴도 없는 인스턴스 메서드)
		public void writeView() {	//약어 출력
				System.out.println("*****약어사전******");
				System.out.println("약어:"+word);
				
		}
		
		
		
}
