package enums;

/**
 * @author Ethan
 * @desc ʵ�ֽӿ�
 */
public enum Color implements Behaviour{
	
	RED("��ɫ",1),GREEN("��ɫ",2),BLANK("��ɫ",3),YELLOW("��ɫ",4);
	
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