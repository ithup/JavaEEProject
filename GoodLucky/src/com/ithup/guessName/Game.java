package com.ithup.guessName;

import java.util.Scanner;

/**
 * 初始化操作
 * 
 * @author acer
 * 
 */
public class Game {
	static int countPeron=0;// Person猜拳的次数
	static int countComputer=0;// Computer猜拳的次数
	private static Scanner input = new Scanner(System.in); // 键盘输入
	public static void startGame() {
		// 创建对象
		Person person = new Person();
		Computer computer = new Computer();
		System.out.println("------------欢迎进入游戏世界--------------\n");
		System.out.println("\t******************");
		System.out.println("\t***  猜拳，开始      ****");
		System.out.println("\t******************\n");
		System.out.println("出拳规则:1.剪刀  2.石头  3.布");
		System.out.print("请选择对方角色(1:刘备  2.孙权  3.曹操):");
		int roleComputer = input.nextInt();		//选择电脑角色
		System.out.print("请输入你的名字：");
		String namePerson = input.next();			//输入比赛人员名字
		switch (roleComputer) {
		case 1:
			computer.name = "刘备";
			break;
		case 2:
			computer.name = "孙权";
			break;
		case 3:
			computer.name = "曹操";
			break;
		}
		System.out.println(namePerson + "VS" + computer.name + "对战");
		System.out.print("要开始吗？(y/n)");
		String choice=input.next();
		if("y".equals(choice)){
			while(true){
				System.out.print("请出拳:1.剪刀  2.石头  3.布(输入相应的数字):");
				int numberPerson = input.nextInt();
				person.showInfo(numberPerson, namePerson);		//传递出拳对应的数字和比赛人员名字
				int numberComputer = computer.showInfo(computer.name);	//返回猜拳数字
				/*
				 * 比较输赢：1.剪刀  2.石头  3.布
				 * 分析：1>2=2    1>3=1    2>3=3
				 */
				if(numberPerson==1 && numberComputer==2){
					System.out.println("你输了,真笨");
					countComputer++;
				}else if(numberPerson==1 && numberComputer==3){
					System.out.println("你赢了");
					countPeron++;
				}else if(numberPerson==2 && numberComputer==1){
					System.out.println("你赢了");
					countPeron++;
				}else if(numberPerson==2 && numberComputer==3){
					System.out.println("你输了,真笨");
					countComputer++;
				}else if(numberPerson==3 && numberComputer==1){
					System.out.println("你输了,真笨");
					countComputer++;
				}else if(numberPerson==3 && numberComputer==2){
					System.out.println("你赢了");
					countPeron++;
				}else{
					System.out.println("平局");
				}
			}
		}
	}
}
