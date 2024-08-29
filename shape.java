package Programs;
class shapes {
	int l = 5;
	int b = 7;
	 int area ;
	public void getride() {
		System.out.println(area);	}
}
class rect extends shapes{
	public void rectangle() {
		area = l*b;
	System.out.println(area);	
	}
}
public class shape{
	public static void main(String[]args) {
	rect a=new rect();
	a.rectangle();
	}
}