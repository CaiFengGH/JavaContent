package thread.basic;

/**
 * @author Ethan
 * @desc 多线程实现一：继承Thread类
 */
public class ThreadTest {

	public static void main(String[] args) {
		
		MyThread myThread1 = new MyThread();
		MyThread myThread2 = new MyThread();
		MyThread myThread3 = new MyThread();
		
		//每个线程都售卖10张票
		myThread1.start();
		myThread2.start();
		myThread3.start();
	}
}

class MyThread extends Thread{
	
	private int tickets = 10;
	
	@Override
	public void run() {
		for(int i = 0; i < 20;i++){
			if(this.tickets > 0){
				System.out.println(this.getName()+" sold:"+this.tickets--);
			}
		}
	}
}
