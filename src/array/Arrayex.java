package array;

import java.util.Scanner;

//10명의 학생의 점수에 총점,평균,최댓값,최솟값을 구해보자 
//점수는 아래와 같습니다
//79,88,91,33,100,55,95,60,72,57

public class Arrayex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//int[] score = {	79,88,91,33,100,55,95,60,72,57 };		//키보드로 입력받아 실행 하지 않을때(Scanner사용 X)
		
		//int[] score = {	0,0,0,0,0,0,0,0,0,0 };              //배열 선언과 동시에 초기화
		int[] score = new int[10]; 								//배열 선언만함(대괄호 안에 있는게 배열 길이)
		
		float avg=0;			//0은 int이며 avg는 float타입 // int와 float은 같은 4바이트지만 int는 정수만 포함하고 float은 실수와 정수를 포함하기 때문에 float 타입이 더 크므로 자동형변환이 된다
		 int sum=0;
		
		 int max = 100;												//최대값 초기값 설정
		 int min = 0;												//최소값 초기값 설정
		
		for(int i=0; i<score.length; i++){				
			score[i]=scan.nextInt();
			sum+=score[i];												//총점 계산
			
			if(score[i]>max){											//배열의 값과 max안 값을 서로 비교하며 
				max=score[i];											//max에 저장되어있는 값보다 크면 최대값으로 저장되게 설정
				System.out.println(max);
			}
			
			if(score[i]<min) {											//배열의 값과 min 값을 서로 비교하면서
				min=score[i];											//min에 저장되어 있는 값보다 작으면 최소값으로 저장
			}
			
		}
		avg=sum/(float)score.length;									//평균값 계산 -> 총점에 배열의 길이를 나누어 준다  //avg는 실수인데 뒤에 값들이 정수이므로 소수점 뒤가 나오지 않게 된다. 그래서 형변환 float을 통해 실수로 바꿔 주어(양쪽중 한쪽만 실수이면됨) 소수점까지 나오게 해줘야 한다
		
		System.out.println("총점:"+sum);
		System.out.println("평균:"+avg);
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
	}
}
