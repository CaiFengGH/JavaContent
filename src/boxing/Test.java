package boxing;

/**
 * @author Ethan
 * @desc �Զ�װ����Զ�����
 * ���ٴ�������ͳ�����ֵ���ڴ濪��
 */
public class Test {
	
	public static void main(String[] args) {
		//1-�Զ�װ��Ͳ���
		//Integer.valueOf(10)
		Integer i = 10;
		//Integer.intValue()����int����ֵ
		int i1 = i;
		
		//2-����IntegerCache��������
		//IntegerCache.low = -128,IntegerCache.high = 127
		//�ڴ˷�Χ��ֱ�ӷ��ػ��������ݣ����򴴽�����
		Integer a = 10;
		Integer b = 10;
		System.out.println("a=b=10:"+(a == b));
		
		Integer c = 10;
		Integer d = 128;
		System.out.println("c=10 d=128:"+(c == d));
	}
}