package DesignPattern.FactoryPattern;

public class FactoryA extends Factory{

	@Override
	public Product manufacture() {
		return new ProductA();
	}
}
