package keyword;

public class a2 {

	public void m1(int a,int b)
	{
		System.out.println("hello bro");
		System.out.println(a+" "+b);
	}
	
	public void m2()
	{
		this.m1(23,54);
		System.out.println("hello shree");
		
	}
	
	public static void main(String[] args) {
		
		a2 s=new a2();
         s.m2();		

	}

}
