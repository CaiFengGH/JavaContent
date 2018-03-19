package thread.basic;

/**
 * @author Ethan
 * @desc join:���̵߳ȴ����߳�ִ�н��������ִ�� 
 */
public class join {
	
	static class MyThread3 extends Thread{
		
		public MyThread3(String name){
			super(name);
		}
		
		public void run(){
			for(int i = 0; i < 10000; i++){
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		MyThread3 myThread = new MyThread3("thread");
		
		try {
			
			myThread.start();
			//1-���̵߳ȴ����߳�ִ�н�������ִ��
			myThread.join();
			
			System.out.println(Thread.currentThread().getName() + " finished");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
