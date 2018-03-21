package thread.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @author Ethan
 * @desc Semaphore:信号量集合,本质上为“共享锁”
 */
public class SemaphoreTest {

	private static final int SIZE = 10;
	
	public static void main(String[] args) {
		Semaphore sem = new Semaphore(SIZE);
		
		ExecutorService es = Executors.newFixedThreadPool(3);
		es.execute(new MyThread0(sem,4));
		es.execute(new MyThread0(sem,5));
		//1-当前信号量许可不足时，等待释放过程
		es.execute(new MyThread0(sem,7));
	}
}
class MyThread0 extends Thread{
	
	private Semaphore sem;
	private int count;
	
	public MyThread0(Semaphore sem,int count){
		this.sem = sem;
		this.count = count;
	}
	
	public void run(){
		try{
			sem.acquire(count);
			System.out.println(Thread.currentThread().getName() + " acquire:" + count);
		}catch(Exception e){
		}finally{
			sem.release(count);
			System.out.println(Thread.currentThread().getName() + " release:" + count);
		}
	}
}