package thread.basic;

public class WaitAndNotify {

	public static void main(String[] args) {
		MyThread2 myThread = new MyThread2("lzw");
		
		synchronized(myThread){
			try {
				System.out.println(Thread.currentThread().getName()+" start");
				myThread.start();
				
				System.out.println(Thread.currentThread().getName()+ " wait");
				
				//1-�˴�main�߳�������wait����ʹ��ǰ�̣߳���ӵ��cpu���߳����������뵽myThread������������
				myThread.wait();
				
				System.out.println(Thread.currentThread().getName() + " is Running");
				
			} catch (Exception e) {
				
			}
		}
	}
}
class MyThread2 extends Thread{

	public MyThread2(String name){
		super(name);
	}
	
	@Override
	public void run() {
		synchronized(this){
			System.out.println(Thread.currentThread().getName() 
					+ " call notify");
			notify();
		}
	}
}