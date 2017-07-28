package com.ithup.guessName;

import org.junit.Test;

/**
 * 
 * @author acer
 *
 */
public class Person {
	String name = "匿名";		//姓名
    int score = 0;			//积分
	public void showInfo(int role,String name){
		switch(role){
		case 1:
			System.out.println(name+"出拳：剪刀");
			break;
		case 2:
			System.out.println(name+"出拳：石头");
			break;
		case 3:
			System.out.println(name+"出拳：布");
			break;
		}
	}
	@Test
	public void test01(){
		Person p=new Person();
		p.showInfo(1,"tom");
	}
}
