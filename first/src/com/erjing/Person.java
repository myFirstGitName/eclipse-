package com.erjing;

public class Person {
 private String name;
 private int age;
public String getName() {
	return name;
}
public void setName(String name) {
		if(name.equals("张三")){
			this.name ="李四";
		}else{
			this.name=name;
		}
	
	
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	if(age>100||age<0){
		
	}else{
	this.age = age;
	}
}
	
	
	
}
