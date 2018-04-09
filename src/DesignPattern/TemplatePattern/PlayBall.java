package DesignPattern.TemplatePattern;

public abstract class PlayBall {
	
	final void playBall(){
		//1-热身
		warmUp();
		//2-玩
		play();
		//3-休息
		rest();
	}

	/**
	 * @author Ethan
	 * @desc 抽象方法不需要函数体
	 */
	public abstract void play();

	public void rest() {
		System.out.println("运动后休息");
	}

	public void warmUp() {
		System.out.println("运动前热身");
	}
}
