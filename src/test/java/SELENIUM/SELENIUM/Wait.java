package SELENIUM.SELENIUM;

public class Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Wait w = new Wait();
		w.getData("Chinniah");
		Wait.getData("arun","chinniah");
		
		
	}
	
	public void getData(String name)
	{
		System.out.println(name);
	}
	
	public static void getData(String name,String name1)
	{
		System.out.println(name + name1);
	}

}
