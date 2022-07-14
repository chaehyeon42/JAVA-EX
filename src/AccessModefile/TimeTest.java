package AccessModefile;

public class TimeTest {

	public static void main(String[] args) {
		
		Time t = new Time(22,32,5);											
					//Time은 매개변수가 3개인 생성자 호출
		System.out.println(t.getHour());
		System.out.println(t.getMinute());
		System.out.println(t.getSecond());
		
	}
}