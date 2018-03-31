package DesignPattern.SingletonPattern.Slacker;

/**
 * @author Ethan
 * @desc ���λ�ȡ���ٴη��ʲ���Ҫ������
 */
public class Singleton1 {
	//1-����ʱ������
	private static Singleton1 instance = null;
	//2-˽�й��캯��
	private Singleton1(){}
	//3-��̬����ʱ���践��
	public static synchronized Singleton1 newInstance(){
		if(instance == null){
			instance = new Singleton1();
			return instance;
		}
		return instance;
	}
}
