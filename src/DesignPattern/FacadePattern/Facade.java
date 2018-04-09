package DesignPattern.FacadePattern;

public class Facade {
	
	private ALight light;
	private BTelevision television;
	
	public Facade(ALight light,BTelevision television){
		this.light = light;
		this.television = television;
	}
	
	public void on(){
		System.out.println("�򿪵���");
		light.LightOn();
		television.TelevisiOn();
	}
	public void off(){
		System.out.println("�رյ���");
		light.LightOff();
		television.TelevisiOff();
	}
}
