package com.ithup.guessName;

import org.junit.Test;

/**
 * 
 * @author acer
 *
 */
public class Person {
	String name = "����";		//����
    int score = 0;			//����
	public void showInfo(int role,String name){
		switch(role){
		case 1:
			System.out.println(name+"��ȭ������");
			break;
		case 2:
			System.out.println(name+"��ȭ��ʯͷ");
			break;
		case 3:
			System.out.println(name+"��ȭ����");
			break;
		}
	}
	@Test
	public void test01(){
		Person p=new Person();
		p.showInfo(1,"tom");
	}
}
