package All;

//1. for문을 이용하여 1~100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성해보자.

public class Allex {
	public static void main(String[] args) {
		//for문을 이용하여 1~100까지의 정수 중
		int num=0;
		int i=0;
		for(i=1;i<=100;i++){
			 //3의 배수
		 if(i%3==0) {	
			num+=i;
		 }
		 }
		System.out.println("1~100까지의 정수중에서 3의 배수의 합은 = "+num);
	}
	
}
