package SELENIUM.SELENIUM;

public class Sample1 extends Wait{
	
	
	public void getData(String name)
	{
		System.out.println("Chandru");
	}
	
	public static void main(String [] args)
	{
		Sample1 s = new Sample1();
		s.getData("chinniah");
		Wait.getData("chinniah", "Venkatesh");
	
		Wait w = new Wait();
		w.getData("Venkatesh");
	}

}
