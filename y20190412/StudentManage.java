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
		System.out.println("请输入学生id：");
		int id = scanner.nextInt();
		System.out.println("请输入学生姓名：");
		String name = scanner.next();
		System.out.println("请输入学生性别：");
		char sex = scanner.next().charAt(0);
		System.out.println("请输入学生年龄：");
		short age = scanner.nextShort();
		System.out.println("请输入学生班级：");
		String grade = scanner.next();
		System.out.println("请输入学生地址：");
		String adress = scanner.next();
		System.out.println("请输入学生电话：");
		int tel = scanner.nextInt();
		System.out.println("请输入学生邮箱：");
		String email = scanner.next();
		StudentManage studentManage = new StudentManage();
		Student stu = new Student(id, name, sex, age, grade,adress, tel, email);
		studentManage.addStudent(stu);
		System.out.println("数据保存成功，返回上级目录。。。");
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
		System.out.println("所剩学生信息"+Arrays.toString(stus));
		sc.stuManagerIndex();
	}

	public void update(int a) {
		
		for (int i = 0; i < stus.length; i++) {
			if (stus[i].id == a) 
			{
				Scanner scanner21 = new Scanner(System.in);
				System.out.println("请输入要修改的属性");
				String b = scanner21.next();
				Scanner scanner22 = new Scanner(System.in);
				System.out.println("请输入要修改的数据");
				int c = scanner22.nextInt();		
				stus[i].stuAge=(short) c;
			}
		}
		
	}

	public static void main(String[] args) {
		StudentManage studentManage = new StudentManage();
		Student stu = new Student(1, "张三", '男', (short) 12, "高级", "天津", 123456, "123456@qq.com");
		studentManage.addStudent(stu);
		Student stu2 = new Student(2, "张三", '男', (short) 12, "高级", "天津", 123456, "123456@qq.com");
		studentManage.addStudent(stu2);
		Student stu3 = new Student(3, "张三", '男', (short) 12, "高级", "天津", 123456, "123456@qq.com");
		studentManage.addStudent(stu3);
		Student stu4 = new Student(4, "张三", '男', (short) 12, "高级", "天津", 123456, "123456@qq.com");
		studentManage.addStudent(stu4);
		System.out.println(Arrays.toString(stus));
		studentManage.del(2);
	}
}
