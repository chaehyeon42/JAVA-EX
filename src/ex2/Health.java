package ex2;

import java.util.Scanner;

//부모 클래스
public class Health {
		Scanner s= new Scanner(System.in);
		//속성
		char gender;		//성별저장- 인스턴스 변수
		double tall;		//키 저장- 인스턴스 변수
		double weight;		//체중저장- 인스턴스 변수
		
		//생성자
		Health(){				//매개변수가 없는 생성자(기본생성자)
			
		}
		
		//메서드
		void input() {			//매개변수가 없고 리턴도 없는 메서드
		System.out.println("성별(M/F):");
		gender=s.next().charAt(0);				 //성별,신장,체중 입력받기				//String 타입을 Char타입으로 형변환 하는 방법: chatAT라는 메서드 사용
		System.out.println("신장(CM):");
		tall=s.nextDouble();
		System.out.println("체중(kg):");
		weight=s.nextDouble();
		}	
		void output1() {		//매개변수가 없고 리턴도 없는 메서드
				System.out.println("성별-"+gender);
				System.out.println("신장-"+tall+"cm");
				System.out.println("체중-"+weight+"kg");
		}
}