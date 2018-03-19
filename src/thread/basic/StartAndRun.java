package thread.basic;

/**
 * @author Ethan
 * @desc �Ƚ�start��run����
 */
public class StartAndRun {

	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		
		System.out.println("ֱ�ӵ���run������");
		//1-run��������ͨ����һ��ֱ�ӵ��ã��ҿ��Ա�main�߳��ظ�����
		myThread1.run();
		
		System.out.println("ֱ�ӵ���start������");
		//2-start�������̣߳��������̵߳�run�������Ҳ��ɱ��ظ�����
		myThread1.start();
		
		//3-�ظ����ã����׳�IllegalThreadStateException�쳣
//		myThread1.start();
		
	}
}
class MyThread1 extends Thread{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is running");
	}	
}

