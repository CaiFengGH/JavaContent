package DesignPattern.ProxyPattern;

/**
 * @author Ethan
 * @desc 代理对象 
 */
public class ProxyObject implements Subject{

	@Override
	public void buyMac() {
		RealObject o = new RealObject();
		o.buyMac();
		this.other();
	}

	/**
	 * @author Ethan
	 * @desc 代理对象附加的方法 
	 */
	private void other() {
		System.out.println("其他方法");
	}
}
