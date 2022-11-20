package keyword;

class b1
{
	public void m1()
	{
		System.out.println("hello");
	}
	}





public class a8 extends b1{
	
  public void m2()
  {   this.m1();
	  System.out.println("shree");
  }

	public static void main(String[] args) {
		
		a8 s=new a8();
		
		s.m2();

	}

}
