package method;

public class MemberServicetest {
	public static void main(String[] args) {
			MemberService ms = new MemberService();
			//MemberService클래스에 있는 login메서드 호출
			if(ms.login("hong", "12345")) {
				System.out.println("로그인 되었습니다.");
				ms.logout("hong");
			}else {
				System.out.println("id 또는 password를 다시 입력하세요");
		}
	}
}
