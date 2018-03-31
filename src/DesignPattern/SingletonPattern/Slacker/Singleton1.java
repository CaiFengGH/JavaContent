package DesignPattern.SingletonPattern.Slacker;

/**
 * @author Ethan
 * @desc 初次获取后，再次访问不需要对象锁
 */
public class Singleton1 {
	//1-加载时不创建
	private static Singleton1 instance = null;
	//2-私有构造函数
	private Singleton1(){}
	//3-静态调用时按需返回
	public static synchronized Singleton1 newInstance(){
		if(instance == null){
			instance = new Singleton1();
			return instance;
		}
		return instance;
	}
}
