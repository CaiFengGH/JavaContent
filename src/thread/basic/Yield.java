package thread.basic;

/**
 * @author Ethan
 * @desc yield:运行状态切换到就绪状态，让步给拥有相同优先级的线程
 */
public class Yield {
	
	public static void main(String[] args) {
		MyThread3 myThread1 = new MyThread3("thread-1");
		MyThread3 myThread2 = new MyThread3("thread-2");
		//1-运行状态时，cpu资源重新被自身抢占
		myThread1.start();
		myThread2.start();
	}
}
	
class MyThread3 extends Thread{

	public MyThread3(String name){
		super(name);
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i < 10; i++){
			System.out.printf("%s [%d]:%d",this.getName(),this.getPriority(),i);
			System.out.println();
			if(i % 4 == 0){
				//2-yield方法只是让步cpu资源
				this.yield();
			}
		}
	}
}
