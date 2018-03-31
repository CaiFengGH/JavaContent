package DesignPattern.SingletonPattern.Hunger;

/**
 * @author Ethan
 * @desc ����ʽʵ��һ
 */
public class Singleton {
	
	//1-����ʱ�Զ�����
	private static Singleton single = new Singleton();
	
	//2-˽�й��캯��
	private Singleton(){}
	
	//3-��̬������ȡ
	public static Singleton newInstance(){
		return single;
	}
}
