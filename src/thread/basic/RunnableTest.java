package thread.basic;

/**
 * @author Ethan
 * @desc ���߳�ʵ�ַ�ʽ����ʵ��Runnable�ӿ�
 */
public class RunnableTest {

	public static void main(String[] args) {
		MyTask myTask = new MyTask();
		
		Thread thread1 = new Thread(myTask);
		Thread thread2 = new Thread(myTask);
		Thread thread3 = new Thread(myTask);
		
		//�����̹߳�ͬ��������Ʊ
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