package com.nenu.model;

import java.util.ArrayList;
import java.util.Scanner;


public class StudentManager {
	ArrayList<Student> array = new ArrayList<Student>();

	// App方法
	
	public void App() {
		System.out.println("**********************************");
		System.out.println("***************1  插入*************");
		System.out.println("***************2  查找*************");
		System.out.println("***************3  删除*************");
		System.out.println("***************4  修改*************");
		System.out.println("***************5  输出*************");
		System.out.println("***************6  退出*************");
		System.out.println("**********************************");
	}

	// 添加功能
	public void addStu(ArrayList<Student> array) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学号");
		int ID = sc.nextInt();
		Scanner ss = new Scanner(System.in);
		System.out.println("请输入姓名");
		String name = ss.nextLine();
		System.out.println("请输入出生日期");
		String birDate = ss.nextLine();
		System.out.println("请输入性别");
		String gender = ss.nextLine();
		Student s = new Student();
		s.setID(ID);
		s.setName(name);
		s.setBirDate(birDate);
		s.setGender(gender);
		array.add(s);
		System.out.println("添加学生成功！");

	}

	// 输出功能
	public static void showStu(ArrayList<Student> array) {
		if (array.size() == 0)
			System.out.println("暂时没有学生被添加!");
		else {
			System.out.println("学号\t姓名\t出生日期\t性别");
			for (int i = 0; i < array.size(); i++) {
				Student s = array.get(i);	
				System.out.println(s.introduction());
			}
		}
	}

	// 查找功能
	public void quickStu(ArrayList<Student> array) {
		System.out.println("请输入你要查找的学生姓名");
		Scanner sc = new Scanner(System.in);
		String targetname = sc.nextLine();
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			if (s.getName().equals(targetname)) {
				System.out.println(s.introduction());
				break;
			} else if (i == array.size() - 1) {
				System.out.println("没有找到该学生");
			}
		}

	}

	// 删除功能
	public void deletStu(ArrayList<Student> array) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要删除学生的姓名");
		String targetname = sc.nextLine();
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			if (s.getName().equals(targetname)) {
				array.remove(i);
				System.out.println("删除成功！");
			} else  {
				System.out.println("没有该学生");
				deletStu(array);
			}
		}
	}
	// 菜单功能

	public void menu() {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			App();
			int n = sc.nextInt();
			switch (n) {
			case 6:
				System.out.println("退出程序！！！");
				return;
			case 1:
				addStu(array);
				break;
			case 2:
				quickStu(array);
				break;
			case 3:
				deletStu(array);
				break;
			case 4:
				System.out.println("该功能尚未实现");
				break;
			case 5:
				showStu(array);
				break;
			default:
				System.out.println("没有该操作,请重新输入");
				break;          //5.14
			}
		}	
	}


}
