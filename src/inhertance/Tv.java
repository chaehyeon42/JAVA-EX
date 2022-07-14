package inhertance;

//상속관계이기 떄문에 부모클래스와 자식클래스 총 두개의 클래스가 필요

//부모클래스(조상클래스)
public class Tv {
	//속성(변수-인스턴스 변수)
	//채널-정수
	int channel;
	//볼륨(정수)
	int volume;
	
	//기능(메서드-인스턴스메소드)
	//채널과 볼륨 기능은 올리면 하니씩 올라가고 내리면 하나씩 내려감(up&down)
	
	//채널up
	void channelUp() {channel++;}
	//채널down
	void channelDown() {channel--;}
	//볼륨 up
	void volumeUp() {volume++;}
	//볼륨down
	void volumeDown() {volume--;}
	
}
