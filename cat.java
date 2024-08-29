package Programs;

public class cat {
	String name="UNKNOWN";
	int age = 0;
	public cat() {
		age = 2;
	}
public static void main(String[]args) {
	cat s=new cat();
	System.out.println(s.name);
	System.out.println(s.age);
	
}
}