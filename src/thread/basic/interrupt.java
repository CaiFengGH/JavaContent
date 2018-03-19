package thread.basic;

/**
 * @author Ethan
 * @desc �����߳��жϴ���ʾ�� 
 */
public class interrupt {
	
	static class MyThread4 extends Thread{
		
		public MyThread4(String name){
			super(name);
		}
		
		//1-����interrupt�����жϣ����쳣��whileѭ��֮�����
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
