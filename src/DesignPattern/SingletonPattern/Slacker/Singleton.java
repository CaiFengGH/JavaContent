package DesignPattern.SingletonPattern.Slacker;

/**
 * @author Ethan
 * @desc �̲߳���ȫ
 */
public class Singleton {
	//1-����ʱ������
	private static Singleton instance = null;
	//2-˽�й��캯��
	private Singleton(){}
	//3-��̬����ʱ���践��
	public static Singleton newInstance(){
		if(instance == null){
			instance = new Singleton();
			return instance;
		}
		return instance;
	}
}
