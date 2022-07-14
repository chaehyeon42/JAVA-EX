package inhertance;

public class OverridingTest {

	public static void main(String[] args) {
		OverridingChid od= new OverridingChid();
		od.x=10;
		od.y=20;
		od.z=30;
		System.out.println(od.add());
	}

}
