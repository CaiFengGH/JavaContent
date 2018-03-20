package thread.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Ethan
 * @desc 基于ReentrantLock实现生产者和消费者问题 
 */
public class ProduceAndConsume {

	public static void main(String[] args) {
		Depot depot = new Depot(100);
		Producer producer = new Producer(depot);
		Consumer consumer = new Consumer(depot);
		
		producer.produce(80);
		producer.produce(100);
		
		consumer.consume(80);
		consumer.consume(120);
		
		producer.produce(100);
	}
}

/**
 * @author Ethan
 * @desc 仓库实现
 */
class Depot{
	private int capacity;
	private int size;
	private Lock lock;
	private Condition fullCondition;
	private Condition emptyCondition;
	
	public Depot(int capacity){
		this.capacity = capacity;
		this.size = 0;
		this.lock = new ReentrantLock();
		this.fullCondition = lock.newCondition();
		this.emptyCondition = lock.newCondition();
	}
	
	public void produce(int value) {
		lock.lock();
		try {
			int left = value;
			while(left > 0){
				//1-参数异常检测
				while(size >= capacity){
					fullCondition.await();
				}
				//2-实际生产量
				int inc = size + left > capacity ? capacity - size : left;
				size += inc;
				left -= inc;
				System.out.printf("%s [%d] : left=%d inc=%d size=%d", 
						Thread.currentThread().getName(),value,left,inc,size);
				System.out.println();
				emptyCondition.notify();
			}
		} catch (Exception e) {
		}finally{
			lock.unlock();
		}
	}

	public void consume(int value) {
		lock.lock();
		try {
			int left = value;
			while(left > 0){
				//1-参数异常检测
				while(size <= 0){
					emptyCondition.await();
				}
				//2-实际生产量
				int inc = size - left < 0 ? size : left;
				size -= inc;
				left -= inc;
				System.out.printf("%s [%d] : left=%d inc=%d size=%d", 
						Thread.currentThread().getName(),value,left,inc,size);
				System.out.println();
				fullCondition.notify();
			}
		} catch (Exception e) {
		}finally{
			lock.unlock();
		}
	}
}

class Producer{
	private Depot depot;
	
	public Producer(Depot depot){
		this.depot = depot;
	}
	
	/**
	 * @author Ethan
	 * @desc 匿名类中参数
	 */
	public void produce(final int value){
		new Thread(){
			public void run(){
				depot.produce(value);
			}
		}.start();
	}
}
class Consumer{
	private Depot depot;
	
	public Consumer(Depot depot){
		this.depot = depot;
	}
	
	public void consume(final int value){
		new Thread(){
			public void run(){
				depot.consume(value);
			}
		}.start();
	}
}
