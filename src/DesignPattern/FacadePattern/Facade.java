package DesignPattern.FacadePattern;

public class Facade {
	
	private ALight light;
	private BTelevision television;
	
	public Facade(ALight light,BTelevision television){
		this.light = light;
		this.television = television;
	}
	
	public void on(){
		System.out.println("打开电器");
		light.LightOn();
		television.TelevisiOn();
	}
	public void off(){
		System.out.println("关闭电器");
		light.LightOff();
		television.TelevisiOff();
	}
}
