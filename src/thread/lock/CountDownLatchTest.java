package thread.lock;

import java.util.concurrent.CountDownLatch;

/**
 * @author Ethan
 * @desc CountDownLatch:完成一组其他线程操作之前，允许一个或者多个线程等待
 */
public class CountDownLatchTest {

	private static int latch_size = 5;
	private static CountDownLatch cdl;
	
	public static void main(String[] args) {
		cdl = new CountDownLatch(latch_size);
		try {
			System.out.println(Thread.currentThread().getName() + " run");
			for (int i = 0; i < latch_size; i++){
				new InnerThread().start();
			}
			//1-main线程阻塞
			cdl.await();
			System.out.println(Thread.currentThread().getName() + " awake");
		} catch (Exception e) {
		}
	}
	
	static class InnerThread extends Thread{
		public void run(){
			try {
				System.out.println(Thread.currentThread().getName()+ " run");
				Thread.sleep(100);
				//2-Thread线程“锁计数器”减一
				cdl.countDown();
			} catch (Exception e) {
			}
		}
	}
}