package DesignPattern.SimpleFactoryPattern;

/**
 * @author Ethan
 * @desc ������ 
 */
public class Factory {

	public static Product manufacture(String productName){
		switch(productName){
			case "A":
				return new ProductA();
			case "B":
				return new ProductB();
			default:
				return null;
		}
	}
}
