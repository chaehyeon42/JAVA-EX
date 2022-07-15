/*
 * 
 */
package AccessModefile;

import java.util.Scanner;

public class BankApplication {
	
	private static Account_[] accountArray = new Account_[4];				//Account 객체 배열 생성
	private static Scanner s = new Scanner(System.in);					//Scanner 생성
	public static int num = 0;
	public static String name;
	
	
	public static void main(String[] args) {
		boolean a=true;
		
		
		while(a) {														//반복문 시작
				System.out.println("================================");
				System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
				System.out.println("================================");
				System.out.println("선택>");
				int menu= s.nextInt();
				
				
				if(menu == 1) {
					//계좌생성
					 createAccount();
				}else if(menu == 2){
					//계좌목록
					accountlist();
				}else if(menu==3) {
					//예금
					deposit();
				}else if(menu==4) {
					//출금
					withdraw();
				}else if(menu==5) {
					//종료
					a=false;
				}
		}
			System.out.println("프로그램 종료");
	}// main
	
	public static void  createAccount(){
		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("---------");
		System.out.println("계좌번호:");
		String ano=s.next();
		System.out.println("계좌주:");
		String name= s.next();
		System.out.println("초기입금액:");
		int balance = s.nextInt();
		accountArray[num]= new Account_(ano,name,balance);
		num++;
		System.out.println("결과: 계좌가 생성되었습니다.");
			
	}

	public static void accountlist() {
		System.out.println("---------");
		System.out.println("계좌목록");
		System.out.println("---------");
		for (int i=0; i<num;i++) {
			System.out.println( accountArray[i].getAno() +accountArray[i].getname()+ accountArray[i].getOwner() + accountArray[i].getBalance() );
		}
	}
	
	private static void deposit() {
		System.out.println("----------");
		System.out.println("예금");
		System.out.println("----------");
		
		System.out.println("계좌번호:");
		String ano = s.next();
		System.out.println("예금액:");
		int balance =  s.nextInt();
		
		for(int i=0; i<num; i++) {
				if(ano.equals(accountArray[i].getAno())) {
					accountArray[i].depositBalance(balance);
					System.out.println("예금이 성공되었습니다.");
				}
		}
	}



		
		private static void withdraw() {
			System.out.println("----------");
			System.out.println("출금");
			System.out.println("----------");
			System.out.println("계좌번호");
			String ano= s.next();
			System.out.println("출금액");
			int balance = s.nextInt();
			Account account = findAccount(ano);
			account.setBalance(account.getBalance()-balance);
			System.out.println("결과:출금이 성공 되었습니다.");
			
		}
	
	
	private static Account findAccount(String ano) {
		Account_ account = null;
			for(int i = 0; i<num;i++) {
				if(accountArray[i].getAno().equals(ano)) {
						account = accountArray[i];
						break;
				}
			}
			return null;
				
	}
		
	
		
}
	

