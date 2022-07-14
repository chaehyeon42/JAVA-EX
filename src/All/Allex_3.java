package All;
//거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다. 변수 money의 금액을 각각 지폐와 동전이 몇 개가 필요한지 계산해서 출력하라. (단, 가능한 한 적은 수의 지폐와 동전으로으로 거슬러 주어야 한다.)


public class Allex_3 {
	public static void main(String[] args) {
		
		//배열선언
		int[] price= {10000,5000,1000,500,100,10};		
		
		//총 금액을 저장
		int money= 37210;
		int out;
		
//		int a = money/price[0];
//		System.out.println(a);
//		
//		money=money-=;
//		int b = money/price[1];
//		System.out.println(b);
//		
//		money = money-b*5000;
//		int c = money/price[2];
//		System.out.println(c);
//		
//		money=money-c*1000;
//		int d =money/price[3];
//		System.out.println(d);
//		
//		money=money-d*500;
//		int e=money/price[4];
//		System.out.println(e);
//		
//		money=money-e*100;
//		int f=money/price[5];
//		System.out.println(f);

		for(int i=0; i<price.length;i++) {
			out=money/price[i];
			money -= out*price[i];
			
			System.out.println(out);
		}
		
		/*선생님 풀이
		for(int i=0; i<price.length;i++) {
			System.out.println(price[i]+"원:"+money/price[i]);
			money%=price[i];
		}
		*/
		
	}
}
