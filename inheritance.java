package Programs;

class test{
		int salary = 60000;
		}
	class engineer extends test{
		int bonous =10000;
		}
	 public class inheritance{
		public static void main(String[] args) {
		engineer a=new engineer();
		System.out.println("salary"+a.salary+"in bonous"+a.bonous);
		
	}
}
