package enums;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Ethan
 * @desc enum类型的测试类
 */
public class EnumTest {
	
	public static void defConstant(){
		LightsEnum[] lightsEnumArr = LightsEnum.values();
		for (LightsEnum light:lightsEnumArr){
			System.out.println(light.toString());
		}
	}
	
	public static void withSwitch(LightsEnum currentLight){
		switch(currentLight){
			case RED:
				System.out.println("This light is RED");
				break;
			case YELLOW:
				System.out.println("This light is YELLOW");
				break;
			case GREEN:
				System.out.println("This light is GREEN");
				break;
			default:
				break;
		}
	}
	
	public static void withValues(){
		LightsEnumWithValues[] lightsEnum = LightsEnumWithValues.values();
		for(LightsEnumWithValues e : lightsEnum){
			System.out.println("toString:"+e.toString());
			System.out.println("getValue:"+e.getValue());
		}
	}
	
	public static void overrideEnum(){
		LightsEnumWithValues[] lightsEnum = LightsEnumWithValues.values();
		for(LightsEnumWithValues e : lightsEnum){
			System.out.println("toString:"+e.toString());
			System.out.println("getValue:"+e.getValue());
		}
	}
	
	public static void enumSetAndMap(){
		//EnumSet
		EnumSet<LightsEnum> enumSet = EnumSet.allOf(LightsEnum.class);
		for (LightsEnum l : enumSet){
			System.out.println(l.toString());
		}
		//EnumMap
		EnumMap<LightsEnum,String> enumMap = new EnumMap<LightsEnum,String>(LightsEnum.class);
		enumMap.put(LightsEnum.RED, "红色");
		Set<Entry<LightsEnum,String>> entrySet = enumMap.entrySet();
		Iterator<Entry<LightsEnum,String>> it = entrySet.iterator();
		while(it.hasNext()){
			Entry<LightsEnum,String> entry =  it.next();
			System.out.println(entry.getKey().toString() + ":" + entry.getValue());
		}
		
	}
	
	public static void main(String[] args) {
		//1-定义常量
		defConstant();
		//2-与switch结合
		withSwitch(LightsEnum.RED);
		//3-有自己的属性和方法
		withValues();
		//4-覆盖枚举的方法
		overrideEnum();
		//5-EnumSet和EnumMap
		enumSetAndMap();
	}
}
