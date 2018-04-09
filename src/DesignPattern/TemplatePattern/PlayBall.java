package DesignPattern.TemplatePattern;

public abstract class PlayBall {
	
	final void playBall(){
		//1-����
		warmUp();
		//2-��
		play();
		//3-��Ϣ
		rest();
	}

	/**
	 * @author Ethan
	 * @desc ���󷽷�����Ҫ������
	 */
	public abstract void play();

	public void rest() {
		System.out.println("�˶�����Ϣ");
	}

	public void warmUp() {
		System.out.println("�˶�ǰ����");
	}
}
