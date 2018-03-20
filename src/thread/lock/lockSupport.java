package thread.lock;

import java.util.concurrent.locks.LockSupport;

/**
 * @author Ethan
 * @desc 验证LockSupport阻塞原语 
 */
public class lockSupport {
	private static Thread mainThread;
	
	public static void main(String[] args) {
		MyThread6 myThread = new MyThread6("thread");
		mainThread = Thread.currentThread();
		
		System.out.println(Thread.currentThread().getName() + " start myThread");
		
		myThread.start();
		
		System.out.println(Thread.currentThread().getName() + " block");
		//1-阻塞主线程
		LockSupport.park(mainThread);
		
		System.out.println(Thread.currentThread().getName() + " continue");
	}

	static class MyThread6 extends Thread{
		
		public MyThread6(String name){
			super(name);
		}
		
		public void run(){
			System.out.println(Thread.currentThread().getName() + " wake up others");
			//2-唤醒主线程
			LockSupport.unpark(mainThread);
		}
	}
}