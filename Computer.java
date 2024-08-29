package Programs;
class Computer {
	String	brand = "hp" ;
	int speed = 1200 ;
	class Processor{
	//String	brand ;
	//int speed ;
	public void displayDetails() {
		System.out.println(brand);
		System.out.println(speed);
	}
}
public static void main(String[]args) {
	Computer s =new Computer();
	Computer.Processor a = s.new Processor();
	a.displayDetails();
	}
		
 
	
}

