package method;

public class Solutiontest {

	public static void main(String[] args) {
		Student st = new Student(); 	//st라는 참조형 변수를 통해 메서드와 변수에 접근이 가능
		st.kor=11;
		st.eng=27;
		st.math=30;
		
		System.out.println(st.getTotal());
		
		System.out.println(Math.round(st.getAverage()*10)/10.0);		//Math.round가 소수 첫째자리에서 반올림 시켜줌(자바 스타일)
	//	System.out.printf("%.1f",st.getAverage());		//%f는 float타입으로 출력 하게 해주는 역할(C언어)
	}

}

