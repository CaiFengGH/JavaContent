package DesignPattern.ProxyPattern;

/**
 * @author Ethan
 * @desc 真实对象 
 */
public class RealObject implements Subject {

	@Override
	public void buyMac() {
		System.out.println("buy a mac");
	}
}
