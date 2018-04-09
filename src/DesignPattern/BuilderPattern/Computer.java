package DesignPattern.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ethan
 * @desc 产品:Computer 
 */
public class Computer {
	
	private List<String> parts = new ArrayList<String>();
	
	public void add(String part){
		parts.add(part);
	}
	
	public void show(){
		for(String part : parts){
			System.out.println(part);
		}
		System.out.println("您需要的组装电脑已经完成，还有什么需要吗？");
	}
}
