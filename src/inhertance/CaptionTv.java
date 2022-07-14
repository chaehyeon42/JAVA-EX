package inhertance;


//자식클래스(Tv클래스의)
	 		//자식쿨래스		  //부모클래스			=>extends를 기준으로 앞쪽이 자식 뒤쪽이 부모(상속관계)
public class CaptionTv extends Tv {
	//자막을 볼건지(true), 안볼건지(false)
	boolean caption;
	//자막을 보여주는 기능(메서드)
	void displayCaption(String text) {
		//caption에 저장되어 있는 값이 true이면 
		  if(caption) {
			  //자막을 보여주세요
			  System.out.println(text);
		  }
	}
}
