package DesignPattern.ProxyPattern;

/**
 * @author Ethan
 * @desc ��ʵ���� 
 */
public class RealObject implements Subject {

	@Override
	public void buyMac() {
		System.out.println("��һ̨mac");
	}
}
