package ProduceAndConsume;

import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Ethan
 * @desc 基于Lock实现生产者消费者
 */
public class LockPattern {

	public static void main(String[] args) {
		SelfQueue selfQueue = new SelfQueue();
		
		Thread proThread = new Thread(new Producer1(selfQueue));
		Thread conThread = new Thread(new Consumer1(selfQueue));
		
		proThread.start();
		conThread.start();
	}
}

class SelfQueue{
	
	private int max = 5;
	private LinkedList<Integer> ll = new LinkedList<Integer>();
	private ReentrantLock lock = new ReentrantLock();
	private Condition full = lock.newCondition();
	private Condition empty = lock.newCondition();
	
	public SelfQueue(){}
	
	public void produce(int res){
		lock.lock();
		try {
			while(max == ll.size()){
				System.out.println("队列已满");
				full.await();
			}
			ll.push(res);
			empty.signal();;
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			lock.unlock();
		}
	}
	
	public int consume(){
		int m = 0;
		lock.lock();
		try {
			while(ll.size() == 0){
				System.out.println("队列为空");
				empty.await();
			}
			m = ll.removeFirst();
			full.signal();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
			return m;
		}
	}
} 

class Producer1 implements Runnable{

	private final SelfQueue selfQueue;
	
	public Producer1(SelfQueue selfQueue){
		this.selfQueue = selfQueue;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++){
			try {
				Random random = new Random();
				int res = random.nextInt(10);
				System.out.println("Produce:"+res);
				selfQueue.produce(res);
			} catch (Exception e) {
				e.getStackTrace();
			}
		}
		
	}
}

class Consumer1 implements Runnable{

	private final SelfQueue selfQueue;
	
	public Consumer1(SelfQueue selfQueue){
		this.selfQueue = selfQueue;
	}
	
	@Override
	public void run() {
		while(true){
			try {
				System.out.println("Consume:"+selfQueue.consume());
			} catch (Exception e) {
				e.getStackTrace();
			}
		}
	}
}