package com.ithup.guessName;

import java.util.Random;

import org.junit.Test;

/**
 * ����
 * @author acer
 *
 */
public class Computer {
	String name = "����";		//����
    int score = 0;			//����
	public int showInfo(String name){
		Random r=new Random();
		int number=r.nextInt(3)+1;	//��ȭ�Ĺ���
		switch(number){
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
		return number;
	}
	@Test
	public void test01(){
		Computer c=new Computer();
		int i = c.showInfo("��Ȩ");
		System.out.println(i);
	}
}