package DesignPattern.SingletonPattern.Slacker;

public class Singleton3 {
	//1-����ʱ������
	private static Singleton3 instance = null;
	//2-˽�й��캯��
	private Singleton3(){}
	//3-��̬����ʱ���践��
	public static Singleton3 newInstance(){
		//4-��һ���ж�
		if(instance == null){
			synchronized(Singleton3.class){
				//5-�ڶ����жϣ����û�еڶ����жϣ��ᴴ���¶���
				if(instance == null){
					instance = new Singleton3();
				}
			}
		}
		return instance;
	}
}
