package code;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);					//scanner는 키보드로 선택 번호 입력할 수 있게됨
		//s는 변수명의 타입이 Scanner 
		
		//while위에 있는 코드들은 while안에 넣으면 값을 넣어도 초기값으로 되기 때문에 따로 빼서 실행(반복되지 않게)
		//메뉴번호를 저장하는 변수
		int menu = 1;
		//잔액을 저장하는 변수(제일 처음 있는 잔액)
		int balance = 0;
		//금액을 저장하는 변수(실행한 후의 금액을 저장)
		int money = 0;
		
		//반복되는 코드들 만 하나로 묶어 실행
		while(true) {															//while문의 조건식이 true면 무한반복이 됨
		System.out.println("-----------------------" );							//--는 문자열이기 때문에 큰따옴표로 묶어줘야한다
		System.out.println("1.예금  2.출금  3.조회 4.종료" );
		System.out.println("-----------------------" );
		System.out.print("선택>");												//println에서 ln을 지워야 엔터의 효과를 지울수 있다
		//입력할수 있는 입력란을 띄움
		menu=s.nextInt();
		//s를 이용해서 scanner안에 있는 속성이나 메서드를 이용 	//선택을 입력할수 있게 커서 생성(nextInt-정수값만 입력했을때 실행)
		
		
		//menu가 1이면(조건문 사용)-마지막 else는 조건이 없을때 안써도 됨
		if(menu==1) {
			//예금
			System.out.print("예금액>");
			money=s.nextInt();
			//잔액=잔액+금액
			balance+=money;
		}else if(menu==2) {							//menu가 2이면
			//출금
			System.out.println("출금액>");
			money=s.nextInt();
			//잔액에서 금액을 뺀 후의 잔액
			balance-=money;	
		}else if(menu==3) {							//menu가 3이면
			//조회;
			System.out.println("잔고:"+balance);
			
		}else if(menu==4) {							//menu가 4이면
			//종료
			break;									//break를 적어주어 무한 반복을 멈추게 해준다
		}
		}
	}
}
