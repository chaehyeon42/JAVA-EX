package All;

import java.util.Scanner;

//5. 홀수와 짝수의 개수를 구하는 프로그램을 만들어라.

public class Allex_5 {
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in); 

	int[] num = {10,25,30,33,77};
	int even=0;		//짝수개수 저장
	int odd=0;		//홀수 개수 저장
	
	for(int i=0; i<num.length; i++){
		if((num[i]%2)==0){
		even++;
		} else if((num[i]%2)==1) {
			odd++;
		}
	}
	
	System.out.println("짝수의 개수는 :"+even+"개입니다");
	System.out.println("홀수의 개수는 :"+odd+"개입니다");
		
	}
}

