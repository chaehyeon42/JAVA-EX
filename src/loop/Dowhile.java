package loop;

public class Dowhile {
	public static void main(String[] args) {
		//while문의 단점을 보완(단점:false 값이면 while문이 실행이 안됨)
		//do{반복할 문장}while(조건식)
		int sum= 0; 
		int i= 0;
		do{
			System.out.println("잠이온다아");
			sum+=i;
			i++;
		}while(sum<100); {
			System.out.println(sum);
		}
	}
}
