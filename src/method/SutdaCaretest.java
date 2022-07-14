package method;

public class SutdaCaretest {

	public static void main(String[] args) {
			SutdaCard card1 = new SutdaCard(3, false); //전체가 인스턴스 생성 
							 //new SutdaCard(3, false): 생성자 호출(매개변수 2개인 생성자)
			
			//전체가 인스턴스 생성
			SutdaCard card2 = new SutdaCard();
							 //	new SutdaCard(): 생성자 호출(매개변수가 없는 생성자 ->기본 생성자)
			System.out.println(card1.info());
			System.out.println(card2.info());
	}

}
