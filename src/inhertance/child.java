package inhertance;

//자식클래스
public class child extends Parent {
		
		int x = 20;
	
		void method() {
				System.out.println("x="+x);					//+x는 자신에게 있는 x값
				System.out.println("this.x="+this.x);		//this.x는 자신에게 있는 x값	
				System.out.println("super.x="+super.x);		//super.x는 부모클래스에 있는 x값
			}
}
