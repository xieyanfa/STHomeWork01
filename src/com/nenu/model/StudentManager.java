package com.nenu.model;

import java.util.ArrayList;
import java.util.Scanner;


public class StudentManager {
	ArrayList<Student> array = new ArrayList<Student>();

	// App����
	
	public void App() {
		System.out.println("**********************************");
		System.out.println("***************1  ����*************");
		System.out.println("***************2  ����*************");
		System.out.println("***************3  ɾ��*************");
		System.out.println("***************4  �޸�*************");
		System.out.println("***************5  ���*************");
		System.out.println("***************6  �˳�*************");
		System.out.println("**********************************");
	}

	// ��ӹ���
	public void addStu(ArrayList<Student> array) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ��");
		int ID = sc.nextInt();
		Scanner ss = new Scanner(System.in);
		System.out.println("����������");
		String name = ss.nextLine();
		System.out.println("�������������");
		String birDate = ss.nextLine();
		System.out.println("�������Ա�");
		String gender = ss.nextLine();
		Student s = new Student();
		s.setID(ID);
		s.setName(name);
		s.setBirDate(birDate);
		s.setGender(gender);
		array.add(s);
		System.out.println("���ѧ���ɹ���");

	}

	// �������
	public static void showStu(ArrayList<Student> array) {
		if (array.size() == 0)
			System.out.println("��ʱû��ѧ�������!");
		else {
			System.out.println("ѧ��\t����\t��������\t�Ա�");
			for (int i = 0; i < array.size(); i++) {
				Student s = array.get(i);	
				System.out.println(s.introduction());
			}
		}
	}

	// ���ҹ���
	public void quickStu(ArrayList<Student> array) {
		System.out.println("��������Ҫ���ҵ�ѧ������");
		Scanner sc = new Scanner(System.in);
		String targetname = sc.nextLine();
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			if (s.getName().equals(targetname)) {
				System.out.println(s.introduction());
				break;
			} else if (i == array.size() - 1) {
				System.out.println("û���ҵ���ѧ��");
			}
		}

	}

	// ɾ������
	public void deletStu(ArrayList<Student> array) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫɾ��ѧ��������");
		String targetname = sc.nextLine();
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			if (s.getName().equals(targetname)) {
				array.remove(i);
				System.out.println("ɾ���ɹ���");
			} else  {
				System.out.println("û�и�ѧ��");
				deletStu(array);
			}
		}
	}
	// �˵�����

	public void menu() {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			App();
			int n = sc.nextInt();
			switch (n) {
			case 6:
				System.out.println("�˳����򣡣���");
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
				System.out.println("�ù�����δʵ��");
				break;
			case 5:
				showStu(array);
				break;
			default:
				System.out.println("û�иò���,����������");
				break;          //5.14
			}
		}	
	}


}
