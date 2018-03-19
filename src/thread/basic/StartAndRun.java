package thread.basic;

/**
 * @author Ethan
 * @desc 比较start和run方法
 */
public class StartAndRun {

	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		
		System.out.println("直接调用run方法：");
		//1-run方法和普通方法一样直接调用，且可以被main线程重复调用
		myThread1.run();
		
		System.out.println("直接调用start方法：");
		//2-start创建新线程，调用新线程的run方法，且不可被重复调用
		myThread1.start();
		
		//3-重复调用，会抛出IllegalThreadStateException异常
//		myThread1.start();
		
	}
}
class MyThread1 extends Thread{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is running");
	}	
}

