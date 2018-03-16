package string;

import java.lang.reflect.Field;

/**
 * @author Ethan
 * @desc 测试String类
 */
public class Test {

	public static void main(String[] args) throws Exception, SecurityException {
		
		//1-""/null/new String()
		String a = null;
		//未分配内存，未创建引用
		String b = "";
		String c = new String();
		//分配内存且创建引用，且内容为空
		
		//2-字符串池
		String d = "abc";
		String e = "abc";
		String f = new String("abc");
		
		System.out.println(d == e);
		System.out.println(d == f);
		//d和e为字符串常量池，f为新创建的对象
		
		//3-String的方法内部生成新对象
		String g = "hello world";
		System.out.println("g = "+g);
		//g引用未发生改变
		g.replace('h', 'H');
		System.out.println("g = "+g);
		
		//4-通过反射改变String
		String h = "hello world";
		System.out.println("h:"+h);
		
		Field valueFieldOfString = String.class.getDeclaredField("value");
		valueFieldOfString.setAccessible(true);
		
		char[] value = (char[]) valueFieldOfString.get(h);

		value[5] = '_';
		System.out.println("h:"+h);
		
		//5-"+"操作符
		String i = "a";
		i += "b";
		//等价于 new StringBuilder(i).append("b").toString()
		System.out.println("i:"+i);
		
	}
}
