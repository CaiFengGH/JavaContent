package string;

import java.lang.reflect.Field;

/**
 * @author Ethan
 * @desc ����String��
 */
public class Test {

	public static void main(String[] args) throws Exception, SecurityException {
		
		//1-""/null/new String()
		String a = null;
		//δ�����ڴ棬δ��������
		String b = "";
		String c = new String();
		//�����ڴ��Ҵ������ã�������Ϊ��
		
		//2-�ַ�����
		String d = "abc";
		String e = "abc";
		String f = new String("abc");
		
		System.out.println(d == e);
		System.out.println(d == f);
		//d��eΪ�ַ��������أ�fΪ�´����Ķ���
		
		//3-String�ķ����ڲ������¶���
		String g = "hello world";
		System.out.println("g = "+g);
		//g����δ�����ı�
		g.replace('h', 'H');
		System.out.println("g = "+g);
		
		//4-ͨ������ı�String
		String h = "hello world";
		System.out.println("h:"+h);
		
		Field valueFieldOfString = String.class.getDeclaredField("value");
		valueFieldOfString.setAccessible(true);
		
		char[] value = (char[]) valueFieldOfString.get(h);

		value[5] = '_';
		System.out.println("h:"+h);
		
		//5-"+"������
		String i = "a";
		i += "b";
		//�ȼ��� new StringBuilder(i).append("b").toString()
		System.out.println("i:"+i);
		
	}
}
