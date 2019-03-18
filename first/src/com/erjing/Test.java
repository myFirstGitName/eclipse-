package com.erjing;

public class Test {
public static void main(String[] args) {
	
/*	Teacher t=new Teacher();
	
	t.setName("张五");
	System.out.println(t.getName());
	t.setAge(110);
	System.out.println(t.getAge());
	int  a=10;
	a=t.getAge();
	int b=a;
	
	int[]i={1,9,8,7,6,5,4846,5464,4864};
	for (int j = 0; j < i.length; j++) {
		if(j==i.length-1){
			System.out.print(i[j]+"}");
		}else if(j==0){
			System.out.print("{"+i[j]+",");
		}else{
			System.out.print(i[j]+",");
		}
		
		
		*/
	for (int i = 0; i <2; i++) {
		for (int j = 0; j < i; j++) {
			System.out.println(j);
			
		}
		
	}
			String s="FTHYFUYTFU";
			s=s.toLowerCase();
	System.out.println(s);
	Teacher t=new Teacher();
	t.setName("张三");
	
	System.out.println(t.getName());
	/*System.out.println(a);
	System.out.println(b);*/
		}	
	
}

