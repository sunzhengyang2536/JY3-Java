package com.neuedu.y20190412;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManage {

	StudentClient sc;
	
	public StudentManage() {
		
	}
	
	public StudentManage(StudentClient sc) {
		this.sc = sc;
	}
	
	static Student[] stus = new Student[0];
	//static Student[] newStus = new Student[0];
	
	public void addStudent(Student student) {
		stus = Arrays.copyOf(stus, stus.length + 1);
		stus[stus.length - 1] = student;
	}
	
	public void addStudentpage(Scanner scanner) {
		System.out.println("������ѧ��id��");
		int id = scanner.nextInt();
		System.out.println("������ѧ��������");
		String name = scanner.next();
		System.out.println("������ѧ���Ա�");
		char sex = scanner.next().charAt(0);
		System.out.println("������ѧ�����䣺");
		short age = scanner.nextShort();
		System.out.println("������ѧ���༶��");
		String grade = scanner.next();
		System.out.println("������ѧ����ַ��");
		String adress = scanner.next();
		System.out.println("������ѧ���绰��");
		int tel = scanner.nextInt();
		System.out.println("������ѧ�����䣺");
		String email = scanner.next();
		StudentManage studentManage = new StudentManage();
		Student stu = new Student(id, name, sex, age, grade,adress, tel, email);
		studentManage.addStudent(stu);
		System.out.println("���ݱ���ɹ��������ϼ�Ŀ¼������");
		sc.stuManagerIndex();
	}

	public void del(int stuId) {
		stus = new Student[stus.length - 1];
		int j = 0;
		for (int i = 0; i < stus.length; i++) {
			if (stuId != stus[i].id) {
				stus[j] = stus[i];
				j++;
			}
		}
		System.out.println("��ʣѧ����Ϣ"+Arrays.toString(stus));
		sc.stuManagerIndex();
	}

	public void update(int a) {
		
		for (int i = 0; i < stus.length; i++) {
			if (stus[i].id == a) 
			{
				Scanner scanner21 = new Scanner(System.in);
				System.out.println("������Ҫ�޸ĵ�����");
				String b = scanner21.next();
				Scanner scanner22 = new Scanner(System.in);
				System.out.println("������Ҫ�޸ĵ�����");
				int c = scanner22.nextInt();		
				stus[i].stuAge=(short) c;
			}
		}
		
	}

	public static void main(String[] args) {
		StudentManage studentManage = new StudentManage();
		Student stu = new Student(1, "����", '��', (short) 12, "�߼�", "���", 123456, "123456@qq.com");
		studentManage.addStudent(stu);
		Student stu2 = new Student(2, "����", '��', (short) 12, "�߼�", "���", 123456, "123456@qq.com");
		studentManage.addStudent(stu2);
		Student stu3 = new Student(3, "����", '��', (short) 12, "�߼�", "���", 123456, "123456@qq.com");
		studentManage.addStudent(stu3);
		Student stu4 = new Student(4, "����", '��', (short) 12, "�߼�", "���", 123456, "123456@qq.com");
		studentManage.addStudent(stu4);
		System.out.println(Arrays.toString(stus));
		studentManage.del(2);
	}
}
