package DesignPattern.FactoryPattern;

public class FactoryB extends Factory{

	@Override
	public Product manufacture() {
		return new ProductB();
	}

}
