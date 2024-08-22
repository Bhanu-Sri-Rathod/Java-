package Programs;

public class thiskeyword {
	void display() {
		this.show();
		System.out.println("BHANU");
	}
	void show() {
		System.out.println(10);
	}
	public static void main(String[]args) {
		thiskeyword t = new thiskeyword();
		t.display();
		
	}
}
