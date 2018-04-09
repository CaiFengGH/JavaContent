package DesignPattern.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ethan
 * @desc ��Ʒ:Computer 
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
		System.out.println("����Ҫ����װ�����Ѿ���ɣ�����ʲô��Ҫ��");
	}
}
