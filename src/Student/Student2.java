package Student;

import java.util.Scanner;

/*
 * 키보드로부터 학생 수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램
입니다. 실행결과를 보고, 알맞게 작성해보세요.
실행 결과
-----------------------------------------------
1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료
-----------------------------------------------
선택> 1
학생수 > 3
-----------------------------------------------
1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료
-----------------------------------------------
선택> 2
첫 번째 학생 > 85(점수만 키보드로 입력)
두 번째 학생 > 95(점수만 키보드로 입력)
세 번째 학생 > 93(점수만 키보드로 입력)
-----------------------------------------------
1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료
-----------------------------------------------
선택> 3
첫 번째 학생 > 85(출력)
두 번째 학생 > 95(출력)
세 번째 학생 > 93(출력)
-----------------------------------------------
1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료
-----------------------------------------------
선택> 4
최고 점수 : 95
평균 점수 : 91.0
-----------------------------------------------
1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료
-----------------------------------------------
선택> 5
프로그램 종료
 */


public class Student2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int menu = 0;			//1~5번을 선택할 변수
		int count = 0;			//학생수
		int[] score= {};		//배열(학생수만큼)
		int max=0; 				//최고 점수
		float avg=0f;			//평균
		
		System.out.println("-----------------------");		
		System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");		
		System.out.println("-----------------------");		
		System.out.println("선택>");	
		
		if(menu==1) {
			System.out.println("학생수>");
			count = sc.nextInt();
			score=new int[count];
		}else if(menu==2) {
			for(int i=0; i<score.length; i++) {
			System.out.println("점수입력>");	
			max=score[0];
			score[i]=sc.nextInt();
		}
		}
		else if(menu==3) {
			for(int i=0; i<score.length;i++) {
			System.out.println("학생>"+score[i]);
			}
		}
		else if(menu==4) {
				System.out.println("최고점수:"+max);
				System.out.println("평균:"+avg);
				
			int i=0;	
			avg+=score[i]/(float)score.length;
		
			System.out.println("최고점수:"+max);
			System.out.println("평균:"+avg);
		}
		else if(menu==5) {
				System.out.println("프로그램 종료");
		}
	
	}

}
