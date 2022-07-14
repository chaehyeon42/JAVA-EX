package array;

//배열
public class Array {

	public static void main(String[] args) {
		//배열 선언 및 초기화
		//int[ ] array = {100,90,98,70,65,67,68,69,61};	//int라는 타입을 적어 주었기 때문에 배열 안에는 사용할수 있음
		//System.out.println(array); 		//이렇게만 쓰면 원하는 값을 가져올수 없으므로 이렇게 사용하면 안됨
		/*반복이 되므로 반복문 for 를 이용
		System.out.println(array[0]);		//인덱스 번호가 있어야 몇번째를 선택해서 가져오는건지 알 수 있음 		
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		*/
		/*이 경우, 배열에 값이 더 추가가 되면 추가된 값이 실행이 안됨 (조건식의 조건 때문에)-수동으로 하나씩 바꿔야함
		//for(초기값;조건식;증감값){반복할 문장}
		for(int i=0; i<=4;i++) {
			System.out.println(array[i]);
		}
		*/	
		//배열명.length를 붙여주면 배열의 길이로 인식 하기 때문에 추가해도 자동으로 변경 가능
		//for(int i=0; i<array.length;i++) {
		//	System.out.println(array[i]);
		}
	}

