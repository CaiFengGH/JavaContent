package DesignPattern.SingletonPattern.Slacker;

/**
 * @author Ethan
 * @desc 线程不安全
 */
public class Singleton {
	//1-加载时不创建
	private static Singleton instance = null;
	//2-私有构造函数
	private Singleton(){}
	//3-静态调用时按需返回
	public static Singleton newInstance(){
		if(instance == null){
			instance = new Singleton();
			return instance;
		}
		return instance;
	}
}
