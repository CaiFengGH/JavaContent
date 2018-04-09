package DesignPattern.BuilderPattern;

public abstract class Builder {
	
	//1-�Cpu
	public abstract void buildCpu();
	//2-�����
	public abstract void buildMainBoard();
	//3-�Ӳ��
	public abstract void buildHD();
	//4-���ɲ�Ʒ
	public abstract Computer getComputer();
	
}
