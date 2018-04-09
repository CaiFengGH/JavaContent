package DesignPattern.BuilderPattern;

public class ABuilder extends Builder {

	private Computer computer = new Computer();
	
	@Override
	public void buildCpu() {
		computer.add("Cpu");
	}

	@Override
	public void buildMainBoard() {
		computer.add("MainBoard");
	}

	@Override
	public void buildHD() {
		computer.add("HD");
	}

	@Override
	public Computer getComputer() {
		return computer;
	}

}
