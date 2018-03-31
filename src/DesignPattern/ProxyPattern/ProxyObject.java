package DesignPattern.ProxyPattern;

/**
 * @author Ethan
 * @desc ������� 
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
	 * @desc ������󸽼ӵķ��� 
	 */
	private void other() {
		System.out.println("��������");
	}
}
