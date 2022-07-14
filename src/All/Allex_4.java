package All;

//4. 약수를 모두 찾는 수학 문제를 풀다가 지친 X는 컴퓨터의 도움을 받아 문제를 풀어 보기로 하였다.

import java.util.Scanner;

public class Allex_4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("입력");
		
		//약수로 나눠지는 수
		int num= sc.nextInt();
		//갯수를 저장하는 변수
		int cnt=0;
		//약수로 나누는 수
		int a;
		
		for(a=1; a<=num; a++){
			if((num%a)==0) {
				System.out.println(a);
				cnt++;
			}
		}
		
	
	System.out.println("약수의 개수는"+cnt+"개 입니다.");
	}
	
}
