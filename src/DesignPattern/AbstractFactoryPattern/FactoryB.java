package DesignPattern.AbstractFactoryPattern;

public class FactoryB extends AbstractFactory {

	@Override
	public HardProduct manufactureHardProdct() {
		return new HardProductB();
	}

	@Override
	public SoftProduct manufactureSoftProdct() {
		return new SoftProductA();
	}
}
