package enums;

public enum LightsEnumWithValues {
	RED("红色"),YELLOW("黄色"),GREEN("绿色");
	
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
