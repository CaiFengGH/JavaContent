package boxing;

/**
 * @author Ethan
 * @desc 自动装箱和自动拆箱
 * 减少创建对象和常用数值的内存开销
 */
public class Test {
	
	public static void main(String[] args) {
		//1-自动装箱和拆箱
		//Integer.valueOf(10)
		Integer i = 10;
		//Integer.intValue()返回int型数值
		int i1 = i;
		
		//2-整数IntegerCache缓存问题
		//IntegerCache.low = -128,IntegerCache.high = 127
		//在此范围内直接返回缓存中内容，否则创建对象
		Integer a = 10;
		Integer b = 10;
		System.out.println("a=b=10:"+(a == b));
		
		Integer c = 10;
		Integer d = 128;
		System.out.println("c=10 d=128:"+(c == d));
	}
}