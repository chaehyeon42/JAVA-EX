/*
 * 
 */
package AccessModefile;

import java.util.Scanner;

public class BankApplication {
	
	private static Account[] accountArray = new Account[4];				//Account 객체 배열 생성
	private static Scanner s = new Scanner(System.in);					//Scanner 생성
	public static int cnt = 0;
	
	public static void main(String[] args) {
		boolean a=true;
		int menu = 1;
		
		
		while(a) {														//반복문 시작
				System.out.println("================================");
				System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
				System.out.println("================================");
				System.out.println("선택>");
	
				
				 menu= s.nextInt();
				
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
					menu=break;
				}
				
		}
	}// main
	public static void createAccount(){
		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("---------");
		System.out.println("계좌번호:");
		String number=s.next();
		System.out.println("계좌주:");
		String name= s.next();
		System.out.println("초기입금액:");
		int balance = s.nextInt();
		
		accountArray[0]= new Account(number, name, balance);
		
		System.out.println("결과: 계좌가 생성되었습니다.");
		
	}
		
}
	

