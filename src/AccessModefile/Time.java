package AccessModefile;

public class Time {
	//시
	private int hour;
	//분
	private int minute;
	//초
	private int second;
	
	//생성자
	Time(int hour, int minute, int second){
		//메서드 호출
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public int getHour() {return hour;}
									//메서드 선언
	public void setHour(int hour) {
		//시간이 0부터 23시일때만 hour 변수에 저장
		if(hour>=0 && hour<=23) {
			this.hour=hour;
		}
	}

	public int getMinute() {return minute;}
	public void setMinute(int minute) {
		//0부터 59분일때만 minute 변수에 저장
		if(minute>=0 && minute<=59) {
			this.minute = minute;
			}
	}
	public int getSecond() {return second;}
	public void setSecond(int second) {
		//초가 0에서 59초 일때만 second변수에 저장
		if(second>=0 && second <=59) {
			this.second = second;
		 }
	}
	
	//get은 main 메소드에 값을 가져다 주는 역할이고 set은 반대로 main 메소드에서 값을 가지고 오는 역할
}
