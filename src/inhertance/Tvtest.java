package inhertance;

public class Tvtest {

	public static void main(String[] args) {
		//TV클래스에 인스턴스 생성 
		// new Tv(); ->Tv 클래스의 주소를 생성
		//포함관계(Tvtest 클래스 안에 Tv클래스를 포함시켜 실행하기에 포함관계라 함)
		//Tv()는 생성자를 호출하는 역할
		//Tv t= new Tv();
	 CaptionTv t= new CaptionTv();
		
			//Tv클래스에 있는 channel변수애 10울 초기화
			t.channel=10;
			t.channelUp();	//이 코드로 인해 channel 값이 11이 됨
			t.channelDown();
	
			t.displayCaption("자막봄1");			//자막봄 1은 void displayCaption(String text)에 text에 저장
			t.caption=true;
			t.displayCaption("자막봄2");
	}

}
