package juc.collection;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Ethan
 * @desc CopyOnWriteArrayList
 */
public class CopyOnWriteArrayListTest {

	private static List<String> list = new CopyOnWriteArrayList<String>();
	
	/**
	 * @author Ethan
	 * @desc ¥Ú”°list 
	 */
	public static void printAll(){
		String value = null; 
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			value = it.next();
			System.out.print(value+" ");
		}
		System.out.println();
	}
	
	static class MyThread extends Thread{
		public MyThread(String name){
			super(name);
		}
		
		public void run(){
			int i = 0;
			while(i++ < 6){
				String value = Thread.currentThread().getName() + "-" + i;
				list.add(value);
				printAll();
			}
		}
	}
	
	public static void main(String[] args) {
		new MyThread("ta").start();
		new MyThread("tb").start();
	}
}
