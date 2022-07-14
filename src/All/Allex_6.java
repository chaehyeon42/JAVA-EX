package All;

import java.util.Scanner;

/*
 * <컴퓨터가 생각한 숫자 맞추기>
     조건     
     1과 100사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값(임의의 값)을 맞추면 게임이 끝남
     사용자가 값을 입력하면 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다.
     사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다.
 */

public class Allex_6 {
	public static void main(String[] args) {
		/*선생님이 짠 코드
		Scanner s = new Scanner(System.in);
	
		//컴퓨터가 생각한 값(임의의값)
		int com=(int)(Math.random()*100)+1;
		int cnt=0; //시도횟수
		
		while(true) {
		cnt++;	
		//사용자가 값을 입력
		System.out.print("1과 100사이의 값을 입력하세요>");
		int user=s.nextInt();
		
		if(com>user) {
			System.out.println("더 큰수를 입력하세요");
		}else if(com<user) {
			System.out.println("더 작은 수를 입력하세요");
		}else if(com==user) {
			System.out.println("정답");
			System.out.println("시도한 횟수는"+cnt+"번 입니다.");
			break;
		}
		}
		*/
		
		 // 내가 짠 코드
		Scanner s = new Scanner(System.in); 
		//1과 100사이의 값을 반복적으로 입력
		//입력할 공간의 변수
		int input=0;
		//시도횟수를 세는 변수
		int count=0;
		
		//입력한 값을 answer에 저장
		int answer=(int)(Math.random()*100)+1;
		
		//반복문이기에 while문 사용
		while(true){
			System.out.println("값을 입력하시오");
			input=s.nextInt();
			count++;
			
			if(answer>input) {								//입력한 값이 입력한 공간보다 클 경우
				System.out.println("더 큰수를 입력하세요");
			}else if(answer<input) {						//입력한 값이 입력한 공간보다 작을경우
				System.out.println("더 작은 수를 입력하세요");
			}else {
				System.out.println("정답");
				System.out.println("시도한 횟수는"+count+"번 입니다.");
				break;
			}
		}
	
	}
}
