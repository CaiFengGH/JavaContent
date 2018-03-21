package thread.lock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author Ethan
 * @desc 测试可重入的读写锁,读锁时共享锁，写锁时独占锁
 */
public class ReadWriteLockTest {

	public static void main(String[] args) {
		Account account = new Account(1,10000);
		
		User user = new User("lzw",account);
		
		for(int i = 0; i < 3; i++){
			user.getCash();
			user.setCash(i*100);
		}
	}
}
/**
 * @author Ethan
 * @desc 用户类
 */
class User {
	
	private String userName;

	private Account account;
	private ReadWriteLock lock;
	
	public User(String userName,Account account){
		this.userName = userName;
		this.account = account;
		this.lock = new ReentrantReadWriteLock();
	}
	
	public void getCash(){
		new Thread(){
			public void run(){
				lock.readLock().lock();
				try {
					System.out.println(Thread.currentThread().getName() + " get cash start");
					account.getCash();
					Thread.sleep(100);
					System.out.println(Thread.currentThread().getName() + " get cash end");
				} catch (Exception e) {
				} finally{
					lock.readLock().unlock();
				}
			}
		}.start();
	}
	
	/**
	 * @desc 匿名内部类使用final参数
	 */
	public void setCash(final int cash){
		new Thread(){
			public void run(){
				lock.writeLock().lock();
				try {
					System.out.println(Thread.currentThread().getName() + " set cash start");
					account.setCash(cash);
					Thread.sleep(100);
					System.out.println(Thread.currentThread().getName() + " set cash end");
					
				} catch (Exception e) {
				} finally {
					lock.writeLock().unlock();
				}
			}
		}.start();
	}
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
/**
 * @author Ethan
 * @desc 用户账户类
 */
class Account {
	private int id;
	private int cash;
	
	public Account(int id,int cash){
		this.id = id;
		this.cash = cash;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCash() {
		System.out.println(Thread.currentThread().getName() + " get cash:" + this.cash);
		return cash;
	}
	public void setCash(int cash) {
		this.cash += cash;
		System.out.println(Thread.currentThread().getName() + " set cash:" + this.cash);
	}
}
