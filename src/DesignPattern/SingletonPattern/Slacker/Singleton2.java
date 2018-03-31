package DesignPattern.SingletonPattern.Slacker;

/**
 * @author Ethan
 * @desc 初次获取后，再次访问不需要对象锁
 */
public class Singleton2 {
	//1-加载时不创建
	private static Singleton2 instance = null;
	//2-私有构造函数
	private Singleton2(){}
	//3-静态调用时按需返回
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
