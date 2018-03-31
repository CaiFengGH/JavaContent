package DesignPattern.AdapterPattern.Object;

/**
 * @author Ethan
 * @desc 通过继承和实现接口方式
 */
public class Adapter220v implements Target {

	//通过委派模式实现
	private PowerPort220v pp220;
	
	public Adapter220v(PowerPort220v pp220){
		this.pp220 = pp220;
	}
	
	@Override
	public void Convert_110v() {
		pp220.output220v();
	}
}
