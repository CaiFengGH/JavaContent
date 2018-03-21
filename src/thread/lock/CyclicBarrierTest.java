package thread.lock;

import java.util.concurrent.CyclicBarrier;

/**
 * @author Ethan
 * @desc CyclicBarrier:允许一组线程相互等待,直到到达公共屏障点,barrier可以重复使用
 */
public class CyclicBarrierTest {

	private static int size = 5;
	private static CyclicBarrier cb;
	
	public static void main(String[] args) {
		//1-到达公共屏障点后执行某项任务
		cb = new CyclicBarrier(size,new Runnable(){
			//2-此任务由那个具体线程执行呢？
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