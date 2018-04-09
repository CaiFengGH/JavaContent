package DesignPattern.BuilderPattern;

public abstract class Builder {
	
	//1-搭建Cpu
	public abstract void buildCpu();
	//2-搭建主板
	public abstract void buildMainBoard();
	//3-搭建硬盘
	public abstract void buildHD();
	//4-生成产品
	public abstract Computer getComputer();
	
}
