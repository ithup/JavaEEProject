package com.ithup.goodlucky;

import java.util.Scanner;


/**
 * 抽奖系统：初始化菜单
 * 
 * @author acer
 * 
 */
public class InitMenu {
	private static Scanner input = new Scanner(System.in);
	private static String name;
	private static String password;
	private static  int count=3;//记录的登录的次数
	private static boolean  isRegister =false;
	public static void main(String[] args) {
		boolean flag = true;
		while (flag) {
			System.out.println("*****欢迎进入奖客富翁系统*****");
			System.out.println("1.注册");
			System.out.println("2.登录");
			System.out.println("3.抽奖");
			System.out.println("*****************************");
			System.out.print("请选择菜单：");
			String choice = input.next();
			switch (choice) {
			case "1":
				userRegister();
				break;
			case "2":
				userLogin();
				break;
			case "3":
				lucky();
				break;
			default:
				System.out.print("输入错误请重新输入：");
				break;
			}
			for (int i = 3; i > 0; i--) {
				System.out.println("继续吗？(y/n)：");
				String str = input.next();
				if ("y".equals(str)) {
					flag = true;
					break;
				} else if ("n".equals(str)) {
					flag = false;
					break;
				} else {
					System.out.println("输入错误请重新输入,你还有" + (i--) + "次机会");
				}
			}
		}
	}

	/**
	 * 抽奖功能
	 */
	private static void lucky() {
		System.out.println("[奖客富翁系统]抽奖");
		System.out.print("请输入你的卡号：");
		int cardNumber = input.nextInt();
		int max = 9999;
		int min = 1000;
		int[] luckyNumber =new int[4];
		luckyNumber[0] = (int) (Math.random() * (max - min)) + min;
		luckyNumber[1] = (int) (Math.random() * (max - min)) + min;
		luckyNumber[2] = (int) (Math.random() * (max - min)) + min;
		luckyNumber[3] = (int) (Math.random() * (max - min)) + min;
		for (int i = 0; i < luckyNumber.length; i++) {
			System.out.print("本次幸运数字为："+luckyNumber+"\t");
		}
		
	}

	/**
	 * 用户登录功能
	 */
	private static void userLogin() {
		System.out.println("[奖客富翁系统>登录]");
		System.out.print("用户名：");
		String username = input.next();
		System.out.print("密码：");
		String newPassword = input.next();
		if (username.equals(name) && newPassword.equals(password)) {
			System.out.println("欢迎您：" + name);
		} 
		else {
			System.out.println("用户名或密码错误，你还有"+(--count)+"次机会");
			if(count==0){
				System.exit(0);
				System.out.println("用户名或密码错误，");
			}
			userLogin();
		}
	}

	/**
	 * 用户注册功能
	 */
	private static void userRegister() {
		System.out.println("[奖客富翁系统>注册]");
		System.out.println("请填写个人注册信息：");
		System.out.print("用户名：");
		String username = input.next();
		System.out.print("密码：");
		String newPassword = input.next();
		int max = 9999;
		int min = 1000;
		int cardNumber = (int) (Math.random() * (max - min)) + min;
		name = username;
		password = newPassword;
		System.out.println("注册成功，请记好你的会员号");
		isRegister = true;
		System.out.println("用户名\t" + "密码\t" + "会员卡号");
		System.out.println(name + "\t" + password + "\t" + cardNumber);
	}
}
