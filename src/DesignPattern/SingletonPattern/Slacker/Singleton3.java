package DesignPattern.SingletonPattern.Slacker;

public class Singleton3 {
	//1-加载时不创建
	private static Singleton3 instance = null;
	//2-私有构造函数
	private Singleton3(){}
	//3-静态调用时按需返回
	public static Singleton3 newInstance(){
		//4-第一重判断
		if(instance == null){
			synchronized(Singleton3.class){
				//5-第二重判断，如果没有第二重判断，会创建新对象
				if(instance == null){
					instance = new Singleton3();
				}
			}
		}
		return instance;
	}
}
