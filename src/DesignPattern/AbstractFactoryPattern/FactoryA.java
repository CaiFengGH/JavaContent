package DesignPattern.AbstractFactoryPattern;

public class FactoryA extends AbstractFactory {

	@Override
	public HardProduct manufactureHardProdct() {
		return new HardProductA();
	}

	@Override
	public SoftProduct manufactureSoftProdct() {
		return new SoftProductB();
	}
}
