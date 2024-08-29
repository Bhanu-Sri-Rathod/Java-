package Programs;
class eat {
	public void move() {
		System.out.println("lion is king of jungel");	}
}
class Animals extends eat{
	public void Cheetah () {
	System.out.println("Cheetah runs faster than other animals");	
	}
}
public class animal{
	public static void main(String[]args) {
	Animals a=new Animals();
	a.Cheetah();
	}
}

