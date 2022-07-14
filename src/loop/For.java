package loop;

public class For {

	public static void main(String[] args) {
			//반복문
			//for(초기값;조건식;증감값){반복할 문장}
			//1~100까지 숫자를 더하라
		int sum=0; 
		int i=0;
		for( i=1;i<=100;i++) {
			 
		sum+=i;
		//System.out.println(sum);						->누적되어 계산한 결과값만 나옴(반복)
		
	 }
		//System.out.println("1~100까지의 합은"+sum);						//->반복되지 않고 마지막 계산값만 나옴 //여기서 +는 앞이 문자열이기 때문에 더하기가 아닌 연결의 의미로 사용
		System.out.println("1~"+(i-1)+"까지의 합은"+sum);						//이렇게 해도 되지만 여기서 i는 지역변수이기 때문에 for문 안에서 실행을 해야만 해야되서 int i를 for 문 밖으로 따로 빼서 변수를 한번더 선언해주고 괄호 안에 i를 1을 먼저 빼준 후 실행(1부터 반복하기 때문에 빼주지 않으면 5051이 나오기 때문)
	
	}
}
