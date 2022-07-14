package All;

//2.while문과 Math.random()메소드를 이용해서 두 개의 주사위를 던졌을 때 나오는 눈이 아래의 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드는 작성해 보자

public class Allex_2 {

	public static void main(String[] args) {
		
		//Math.random()은 0~0.99999999999사이에 있는 임의의 값을 리턴주는 역할
		//while문과 Math.random()메소드를 이용
		while(true) {
			//두개의 주사위를 던졌을때 나올수 있는 랜덤값(범위와 형변환 필요-int를 해야 정수가 나옴//Math.random은 double타입)
			//첫번째 주사위에서 나온 결과를 num_1변수에 저장
			int num_1=(int)(Math.random()*6)+1;								//Math.random에 6을 곱하게 되면 random의 범위 안에 있는 값에 ~를 기준으로 왼쪽 오른쪽에 6이 곱해지고 소수점 0~5.4,,,로 나오므로 +1 을 해줘야 1~6의 범위로 바뀌므로 더해준다
		    //두번째 주사위에서 나온 결과를 num_2변수에 저장
			int num_2=(int)(Math.random()*6)+1;
		//눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드는 작성해 보자
			System.out.println("("+num_1+","+num_2+")");
			if(num_1+num_2==5){
				break;
			}
		}

	}

}
