package com.ithup.guessName;

import java.util.Scanner;

/**
 * ��ʼ������
 * 
 * @author acer
 * 
 */
public class Game {
	static int countPeron=0;// Person��ȭ�Ĵ���
	static int countComputer=0;// Computer��ȭ�Ĵ���
	private static Scanner input = new Scanner(System.in); // ��������
	public static void startGame() {
		// ��������
		Person person = new Person();
		Computer computer = new Computer();
		System.out.println("------------��ӭ������Ϸ����--------------\n");
		System.out.println("\t******************");
		System.out.println("\t***  ��ȭ����ʼ      ****");
		System.out.println("\t******************\n");
		System.out.println("��ȭ����:1.����  2.ʯͷ  3.��");
		System.out.print("��ѡ��Է���ɫ(1:����  2.��Ȩ  3.�ܲ�):");
		int roleComputer = input.nextInt();		//ѡ����Խ�ɫ
		System.out.print("������������֣�");
		String namePerson = input.next();			//���������Ա����
		switch (roleComputer) {
		case 1:
			computer.name = "����";
			break;
		case 2:
			computer.name = "��Ȩ";
			break;
		case 3:
			computer.name = "�ܲ�";
			break;
		}
		System.out.println(namePerson + "VS" + computer.name + "��ս");
		System.out.print("Ҫ��ʼ��(y/n)");
		String choice=input.next();
		if("y".equals(choice)){
			while(true){
				System.out.print("���ȭ:1.����  2.ʯͷ  3.��(������Ӧ������):");
				int numberPerson = input.nextInt();
				person.showInfo(numberPerson, namePerson);		//���ݳ�ȭ��Ӧ�����ֺͱ�����Ա����
				int numberComputer = computer.showInfo(computer.name);	//���ز�ȭ����
				/*
				 * �Ƚ���Ӯ��1.����  2.ʯͷ  3.��
				 * ������1>2=2    1>3=1    2>3=3
				 */
				if(numberPerson==1 && numberComputer==2){
					System.out.println("������,�汿");
					countComputer++;
				}else if(numberPerson==1 && numberComputer==3){
					System.out.println("��Ӯ��");
					countPeron++;
				}else if(numberPerson==2 && numberComputer==1){
					System.out.println("��Ӯ��");
					countPeron++;
				}else if(numberPerson==2 && numberComputer==3){
					System.out.println("������,�汿");
					countComputer++;
				}else if(numberPerson==3 && numberComputer==1){
					System.out.println("������,�汿");
					countComputer++;
				}else if(numberPerson==3 && numberComputer==2){
					System.out.println("��Ӯ��");
					countPeron++;
				}else{
					System.out.println("ƽ��");
				}
			}
		}
	}
}
