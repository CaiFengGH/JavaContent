package polymorphism;

public class Test {
	
	public static void main(String[] args) {
		//1-��������ָ���������
		Girl girl = new MMGirl();
		//��������smile����
		girl.smile();
		//��ʧ�����в����ڵķ���
		//girl.eat();
		MMGirl mmGirl = (MMGirl) girl;
		mmGirl.smile();
		mmGirl.eat();
		
		//2-��������ָ�����������ת�ͣ������޴�,����ʱ����java.lang.ClassCastException
		//Girl newGirl = new Girl();
		//MMGirl newMMGirl = (MMGirl) newGirl;
		//newMMGirl.smile();
		
		//3-��������ָ�������������ת�ͣ���ʧ�����в����ڵķ���������������д����
		MMGirl girl1 = new MMGirl();
		Girl girl2 = (Girl)girl1;
		girl2.smile();
		
		//4-��������ָ������󣬱���ʱ����
		
	}
}
