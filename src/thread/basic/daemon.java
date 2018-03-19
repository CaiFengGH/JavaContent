package thread.basic;

/**
 * @author Ethan
 * @desc 线程可以标示为用户线程和守护线程 
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
		
		//1-优先级1~10，默认是5
		System.out.println(Thread.currentThread().getName() + "isDaemon("+ 
				Thread.currentThread().isDaemon() +") priority:" + Thread.currentThread().getPriority());
		
		//2-线程分为用户线程和守护线程
		myThread4.setDaemon(true);

		//3-当线程仅余守护线程时，JVM自动退出
		myThread4.start();
		myThread5.start();
	}
}
