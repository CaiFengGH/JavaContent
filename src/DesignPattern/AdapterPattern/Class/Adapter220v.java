package DesignPattern.AdapterPattern.Class;

/**
 * @author Ethan
 * @desc 通过继承和实现接口方式
 */
public class Adapter220v extends PowerPort220v implements Target {

	@Override
	public void Convert_110v() {
		this.output220v();
	}
}
