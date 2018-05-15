package ProduceAndConsume;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Ethan
 * @desc 基于阻塞队列实现生产者消费者
 */
public class BlockingQueuePattern {

	public static void main(String[] args) {
		
		BlockingQueue<Integer> sharedQueue = new LinkedBlockingQueue<>();
		
		Thread proThread = new Thread(new Producer(sharedQueue));
		Thread conThread = new Thread(new Consumer(sharedQueue));
		
		proThread.start();
		conThread.start();
		
	}
}

class Producer implements Runnable{

	private final BlockingQueue<Integer> sharedQueue;
	
	public Producer(BlockingQueue<Integer> sharedQueue){
		this.sharedQueue = sharedQueue;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++){
			try {
				Random random = new Random();
				int res = random.nextInt(10);
				System.out.println("Produce:"+res);
				sharedQueue.put(res);
			} catch (Exception e) {
				e.getStackTrace();
			}
		}
		
	}
}

class Consumer implements Runnable{

	private final BlockingQueue<Integer> sharedQueue;
	
	public Consumer(BlockingQueue<Integer> sharedQueue){
		this.sharedQueue = sharedQueue;
	}
	
	@Override
	public void run() {
		while(true){
			try {
				System.out.println("Consume:"+sharedQueue.take());
			} catch (Exception e) {
				e.getStackTrace();
			}
		}
	}
}