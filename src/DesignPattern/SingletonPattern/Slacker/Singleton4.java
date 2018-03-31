package DesignPattern.SingletonPattern.Slacker;

/**
 * @author Ethan
 * @desc ���ھ�̬�ڲ���ʵ��
 */
public class Singleton4 {

	public static class Singleton{
		private static Singleton4 instance = new Singleton4();
	}
	
	private Singleton4(){}
	
	public static Singleton4 newInstance(){
		return Singleton.instance;
	}
}

