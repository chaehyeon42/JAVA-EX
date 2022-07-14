package array;

public class ObjectArrayTest {

	public static void main(String[] args) {
		//배열만드는 두가지 방법
		//int[] array= new int[7];
//		int[] array = new int[7];
//		array[0]=10;
//		array[1]=20;
//		array[2]=30;
//		array[3]=40;
//		array[4]=50;
//		array[5]=60;
//		array[6]=70;
//		array[7]=80;
			
		//타입을 객체 타입으로줌
		//데이터(이름과 점수 변수)를 objarray에 저장
		
		//타입
		//ObjectArray[]	objarray = new ObjectArray[7];	
		  ObjectArray[]	objarray = {};	
			//objarray[0]=10; ->이렇게 할경우 이름에 저장하는건지 점수에 저장하는건지 명확하지 않으므로 이렇게 사용하면 안됨
			objarray[0].score=100; 
			objarray[0].name="정바";
			
			
			objarray[1].name="정자바";
			objarray[1].score=96;

			objarray[2].score=86;
			objarray[2].name="나비";
			
			
	}
}
