package DesignPattern.BuilderPattern;

public class Director {
	
	public void build(Builder builder){
		builder.buildCpu();
		builder.buildMainBoard();
		builder.buildHD();
	}
}
