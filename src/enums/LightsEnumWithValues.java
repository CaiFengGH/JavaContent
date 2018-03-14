package enums;

public enum LightsEnumWithValues {
	RED("��ɫ"),YELLOW("��ɫ"),GREEN("��ɫ");
	
	private String value;
	
	LightsEnumWithValues(String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
	
	@Override
	public String toString(){
		return this.name() + "_" + this.value;
	}
}
