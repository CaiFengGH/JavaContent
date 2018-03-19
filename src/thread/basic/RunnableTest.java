package thread.basic;

/**
 * @author Ethan
 * @desc 多线程实现方式二：实现Runnable接口
 */
public class RunnableTest {

	public static void main(String[] args) {
		MyTask myTask = new MyTask();
		
		Thread thread1 = new Thread(myTask);
		Thread thread2 = new Thread(myTask);
		Thread thread3 = new Thread(myTask);
		
		//三个线程共同销售三张票
		thread1.start();
		thread2.start();
		thread3.start();
	}
}

class MyTask implements Runnable{

	private int tickets = 10;
	
	@Override
	public void run() {
		for(int i = 0; i < 20; i++){
			if(this.tickets > 0){
				System.out.println(Thread.currentThread().getName()+" sold"+this.tickets--);
			}
		}
	}
}