package DesignPattern.AdapterPattern.Class;

/**
 * @author Ethan
 * @desc ͨ���̳к�ʵ�ֽӿڷ�ʽ
 */
public class Adapter220v extends PowerPort220v implements Target {

	@Override
	public void Convert_110v() {
		this.output220v();
	}
}
