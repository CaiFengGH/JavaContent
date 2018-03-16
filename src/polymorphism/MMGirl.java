package polymorphism;

public class MMGirl extends Girl{
	
	@Override
	public void smile(){
		System.out.println("MMGirl smile ...");
	}
	
	public void eat(){
		System.out.println("MMGirl eat ...");
	}
}