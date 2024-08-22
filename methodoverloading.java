package Programs;

public class methodoverloading {
	public int sum(int x,int y)
	{
		return (x+y);
	}
	public int sum(int x,int y,int z)
	{
		return(x+y+z);
	}
	public double sum(double x,double y)
	{
		return(x+y);
	}
	public static void main(String[]args) {
		methodoverloading a = new methodoverloading();
		System.out.println(a.sum(1,0));
		System.out.println(a.sum(7,0,8));
		System.out.println(a.sum(7.0,9.0));
	}
}
