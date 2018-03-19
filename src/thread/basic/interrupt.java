package thread.basic;

/**
 * @author Ethan
 * @desc 常用线程中断代码示例 
 */
public class interrupt {
	
	static class MyThread4 extends Thread{
		
		public MyThread4(String name){
			super(name);
		}
		
		//1-调用interrupt方法中断，且异常在while循环之外进行
		public void run(){
			try {
				int i = 0;
				while(!isInterrupted()){
					Thread.sleep(100);
					i++;
					System.out.println(this.getName() + " (" + this.getState() + ") loop" + i);
				}
			} catch (InterruptedException e) {
				System.out.println(this.getName() + " (" + this.getState() + 
						") catch InterruptedException");
			}
		}
	}
}
