package loop;

public class While {
	public static void main(String[] args) {
				//while(조건식){반복할문장}
				//1~100까지 숫자의 합이 100미만이 될 동안 반복해라
		int sum= 0; 
		int i= 0;
		while(sum<100) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
	}
}
