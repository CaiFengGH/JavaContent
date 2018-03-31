package DesignPattern.StrategyPattern;

public class Context {

	private Strategy strategy;
	
	public Context(String str){
		switch (str) {
		case "A":
			strategy = new StrategyA();
			break;
		case "B":
			strategy = new StrategyB();
			break;
		default:
			break;
		}
	}
	
	public void show(){
		strategy.show();
	}
}
