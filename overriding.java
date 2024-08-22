package Programs;
class dance{
	public void display() {
		System.out.println("i love to dance");
	}
}
class classical extends dance{
	public void display() {
		System.out.println("classical dance is tough to learn");
	}
}
public class overriding {
	public static void main(String[]args) {
		classical c =new classical();
		dance d= new dance();
		d.display();
		c.display();
	}

}
