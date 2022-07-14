package inhertance;

//자식클래스
public class Point2 extends Point {
		int z;
		
		Point2(int x, int y, int z){
			//super()는 반드시 제일 첫번쨰 줄에 있어야 한다
			//부모클래스의 생성자
			super (x, y);		//	super();는 매개변수가 없는 기본생성자 (Point(){})를 받았기 때문에 이렇게만 하면 에러가 뜸
			this.z=z;
			
		}
		String getLocation() {//오버라이딩
			return "x:"+ x +",y:"+ y +",z:"+z;
}
}