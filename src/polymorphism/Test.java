package polymorphism;

public class Test {
	
	public static void main(String[] args) {
		//1-父类引用指向子类对象
		Girl girl = new MMGirl();
		//调用子类smile方法
		girl.smile();
		//丢失父类中不存在的方法
		//girl.eat();
		MMGirl mmGirl = (MMGirl) girl;
		mmGirl.smile();
		mmGirl.eat();
		
		//2-父类引用指向父类对象，向下转型，编译无错,运行时报出java.lang.ClassCastException
		//Girl newGirl = new Girl();
		//MMGirl newMMGirl = (MMGirl) newGirl;
		//newMMGirl.smile();
		
		//3-子类引用指向子类对象，向上转型，丢失父类中不存在的方法，调用子类重写方法
		MMGirl girl1 = new MMGirl();
		Girl girl2 = (Girl)girl1;
		girl2.smile();
		
		//4-子类引用指向父类对象，编译时报错
		
	}
}
