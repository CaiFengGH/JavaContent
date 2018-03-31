package DesignPattern.SingletonPattern.Hunger;

/**
 * @author Ethan
 * @desc 饿汉式实现一
 */
public class Singleton {
	
	//1-加载时自动创建
	private static Singleton single = new Singleton();
	
	//2-私有构造函数
	private Singleton(){}
	
	//3-静态方法获取
	public static Singleton newInstance(){
		return single;
	}
}
