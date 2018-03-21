package thread.lock;

import java.util.concurrent.CyclicBarrier;

/**
 * @author Ethan
 * @desc CyclicBarrier:����һ���߳��໥�ȴ�,ֱ�����﹫�����ϵ�,barrier�����ظ�ʹ��
 */
public class CyclicBarrierTest {

	private static int size = 5;
	private static CyclicBarrier cb;
	
	public static void main(String[] args) {
		//1-���﹫�����ϵ��ִ��ĳ������
		cb = new CyclicBarrier(size,new Runnable(){
			//2-���������Ǹ������߳�ִ���أ�
			public void run(){
				System.out.println(Thread.currentThread().getName() 
						+ " parties:"+cb.getParties());
			}
		});
		for(int i = 0; i < size; i++){
			new InnerThread1().start();
		}
	}
	
	static class InnerThread1 extends Thread{
		public void run(){
			try {
				System.out.println(Thread.currentThread().getName() + " start");
				cb.await();
				System.out.println(Thread.currentThread().getName() + " run");
			} catch (Exception e) {
			}
		}
	}
}