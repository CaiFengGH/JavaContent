package thread.basic;

/**
 * @author Ethan
 * @desc �߳̿��Ա�ʾΪ�û��̺߳��ػ��߳� 
 */
public class daemon {

	static class MyThread4 extends Thread{
		public MyThread4(String name){
			super(name);
		}
		
		public void run(){
			try {
				for(int i = 0; i < 5; i++){
					Thread.sleep(100);
					System.out.println(this.getName() + " isDaemon(" + this.isDaemon() 
							+ ") " +"loop "+ i);
				}
			} catch (Exception e) {
			}
		}
	}
	
	static class MyThread5 extends Thread{
		public MyThread5(String name){
			super(name);
		}
		
		public void run(){
			try {
				for(int i = 0; i < 10000; i++){
					Thread.sleep(100);
					System.out.println(this.getName() + " isDaemon(" + this.isDaemon() 
							+ ") " +"loop "+ i);
				}
			} catch (Exception e) {
			}
		}
	}
	
	public static void main(String[] args) {
		
		MyThread4 myThread4 = new MyThread4("thread4");
		MyThread4 myThread5 = new MyThread4("thread5");
		
		//1-���ȼ�1~10��Ĭ����5
		System.out.println(Thread.currentThread().getName() + "isDaemon("+ 
				Thread.currentThread().isDaemon() +") priority:" + Thread.currentThread().getPriority());
		
		//2-�̷߳�Ϊ�û��̺߳��ػ��߳�
		myThread4.setDaemon(true);

		//3-���߳̽����ػ��߳�ʱ��JVM�Զ��˳�
		myThread4.start();
		myThread5.start();
	}
}
