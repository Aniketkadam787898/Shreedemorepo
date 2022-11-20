package keyword;

class a6{
	
	int a=43;
	
	int b=54;
	public void m1(int a ,int b)
	{
		this.a=a;
		this.b=b;
		
  System.out.println(a);
  System.out.println(b);
		System.out.println("hello");
	}
}



public class a5 extends a6 {
	
	

	public static void main(String[] args) {
		
     a5 s=new a5();
     s.m1(43,54); 
     
	}

}
