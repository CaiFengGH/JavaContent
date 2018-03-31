package DesignPattern.AdapterPattern.Object;

/**
 * @author Ethan
 * @desc ͨ���̳к�ʵ�ֽӿڷ�ʽ
 */
public class Adapter220v implements Target {

	//ͨ��ί��ģʽʵ��
	private PowerPort220v pp220;
	
	public Adapter220v(PowerPort220v pp220){
		this.pp220 = pp220;
	}
	
	@Override
	public void Convert_110v() {
		pp220.output220v();
	}
}
