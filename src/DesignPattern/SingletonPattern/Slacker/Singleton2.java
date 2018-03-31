package DesignPattern.SingletonPattern.Slacker;

/**
 * @author Ethan
 * @desc ���λ�ȡ���ٴη��ʲ���Ҫ������
 */
public class Singleton2 {
	//1-����ʱ������
	private static Singleton2 instance = null;
	//2-˽�й��캯��
	private Singleton2(){}
	//3-��̬����ʱ���践��
	public static Singleton2 newInstance(){
		synchronized(Singleton2.class){
			if(instance == null){
				instance = new Singleton2();
				return instance;
			}
			return instance;
		}
	}
}
