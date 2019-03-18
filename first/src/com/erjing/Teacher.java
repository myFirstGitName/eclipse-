package com.erjing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.MissingFormatArgumentException;

public class Teacher extends Person {


	public static void main(String[] args) {
		List list=new ArrayList<>();
		
		
		list.add("张三");
		list.add(null);
		list.add("张三");
		list.add("张三");
		list.add("张三");
		
		list.add("张三");
		list.add("张三");
		list.add(123);
		Map map=new HashMap<>();
		map.put("list", list);
		map.put("list",123);
		map.put("list", 312);
		map.put("321t", 312);
		map.put("321", 312);
		
		Object obj=map.get("list");
		System.out.println(obj);
		String ss=" ";
		String s=null;
		System.out.println(s+ss+"1");
		Teacher t=new Teacher();
		t.add();
	}
	
	void  add(){
	System.out.println("das");	
		
		
	}
}
class asd{
	
	public static void main(String[] args) {
		Teacher t=new Teacher();
		t.add();
	}
	
	
	
	
}