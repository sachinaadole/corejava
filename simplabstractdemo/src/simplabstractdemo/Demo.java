package simplabstractdemo;

public abstract class Demo 
{
	
	int i=10;
	public abstract void  name();
	public void m1()
	{
		System.out.println("this is instance method");
	}
	public static void main(String[] args) 
	{
		Demo d=new Child();
		
		
		d.m1();
		System.out.println(d.i);
		d.name();
		
		Child c=new Child();
		c.m1();
		c.m2();
		System.out.println("instace varibale"+c.j);
		
	}

}
class Child extends Demo
{
	int j=10;

	public void name() 
	{
		System.out.println("this implemation of abstract method "+i);
		
	}
	public  void m2() 
	{
	System.out.println("this instance method child class");	
	}
	
}
