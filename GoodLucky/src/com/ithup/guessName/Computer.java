package com.ithup.guessName;

import java.util.Random;

import org.junit.Test;

/**
 * 电脑
 * @author acer
 *
 */
public class Computer {
	String name = "匿名";		//姓名
    int score = 0;			//积分
	public int showInfo(String name){
		Random r=new Random();
		int number=r.nextInt(3)+1;	//出拳的规则
		switch(number){
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
		return number;
	}
	@Test
	public void test01(){
		Computer c=new Computer();
		int i = c.showInfo("孙权");
		System.out.println(i);
	}
}
