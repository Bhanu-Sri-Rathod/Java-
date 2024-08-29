package Programs;

public class dog {
	String name;
	String colour;
public dog(String a,String b)
{
	name = a;
	colour = b;
}
public static void main(String[]args) {
	dog o = new dog("chikki","cream");
	System.out.println("Dog name is:"+o.name);
	System.out.println("Dog colour is:"+o.colour);
}
}
