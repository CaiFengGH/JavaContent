package enums;

/**
 * @author Ethan
 * @desc 实现接口
 */
public enum Color implements Behaviour{
	
	RED("红色",1),GREEN("绿色",2),BLANK("白色",3),YELLOW("黄色",4);
	
	private String name;
	
	private int index;

	Color(String name,int index){
		this.name = name;
		this.index = index;
	}
	
	@Override
	public void print() {
		System.out.println(this.index + ":" + this.name);
	}

	@Override
	public String getInfo() {
		return this.name;
	}
}