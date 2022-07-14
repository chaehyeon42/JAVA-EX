package condition;

import java.util.Scanner;

public class IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//java 조건문
		//else가 없는 if문	->평균이 70점 이상이면 합격 
		//평균을 저장하는 변수(avg)
		//자동형변환 발생
		/*
	 	if(평균이 70점 이상) {
						합격을 출력
				}
		*/
		/*
		float avg=70f;
		if(avg >= 70) {
			System.out.println("합격");
		}
		*/
		
		//if ~ else 문->평균이 70점 이상이면 합격, 그렇지 않으면 불합격
		//자동형변환 발생
		/*
		float avg=71.5f;
		if(avg >=70) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		*/
		
		//if ~ else if ~ else 문 (조건이 여러개일때 이용)
		//평균이 70점 이상이면 합격, 평균이 69.5이상이면 보류, 그렇지 않으면 불합격
		//자동형변환 발생
		Scanner s = new Scanner(System.in); 	//s라는 변수에 Scanner 가 타입
		
		//int와 비교되는게 Scanner -> int a = 10
		float avg=100f;
		if(avg>=70) {
			System.out.println("합격");
		}else if(avg>=60.5){
			System.out.println("보류");
		}else {
			System.out.println("불합격");
		}
	}

}

