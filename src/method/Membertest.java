package method;

public class Membertest {

	public static void main(String[] args) {
		//2번문제	
		Member user1 = new Member("홍길동", "hong");
		Member user2 = new Member("강자바", "java");
		
		System.out.println(user1.name);
		System.out.println(user1.id);

		System.out.println(user2.name);
		System.out.println(user2.id);
	}

}
