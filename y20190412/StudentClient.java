package com.neuedu.y20190412;

import java.util.*;

public class StudentClient {
	static String userName = "admin";
	static String passWord = "admin";
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("*************欢迎来到学生管理系*************");
		System.out.println("1.登陆                             2.退出");
		System.out.println("********************************************");
		StudentClient StudentClient = new StudentClient();
		StudentClient.welcomePage();
	}
	
	StudentManage sm =  new StudentManage(this);

	public void welcomePage() {
		System.out.println("请选择");
		int c = scanner.nextInt();
		switch (c) {
		case 1:
			System.out.println("欢迎登陆");
			System.out.println("请输入用户名");
			String usn = scanner.next();
			System.out.println("请输入密码");
			String psw = scanner.next();
			Admin admin = new Admin(usn, psw);
			boolean l = login(admin);
			if (l = true) {
				System.out.println("欢迎您，" + usn);
				stuManagerIndex();
			} else {
				welcomePage();
			}
			break;
		case 2:
			exit();
		default:
			System.out.println("输入有误，请重新选择");
			welcomePage();
		}
	}

	public boolean login(Admin a) {
		if (userName.equals(a.username) && passWord.equals(a.password)) {
			return true;
		}
		return false;
	}

	public void exit() {
		System.exit(0);
	}
	
	public void stuManagerIndex() {
		System.out.println("***************请选择需要操作的信息所对应的数字  ***************");
		System.out.println("*1.查看学生信息   2.添加学生信息    3.删除学生信息    4.修改学生信息     5.退出*");
		System.out.println("****************************************************");
	    System.out.println("请选择：");
	    int nextInt = scanner.nextInt();
	    switch (nextInt) {
	    case 1:
	    	System.out.println(Arrays.toString(StudentManage.stus));
	    	StudentClient ssc = new StudentClient();
	    	ssc.stuManagerIndex();
	    	break;
	    case 2:
	    	sm.addStudentpage(scanner);
	    	break;
	    case 3:
	        System.out.println("请输入要删除的id");
	    	int stuId = scanner.nextInt();
			sm.del(stuId);
	        break;
	    case 4:
	    	System.out.println("请输入要修改的id");
			int a = scanner.nextInt();
	    	sm.update(a);
	    	StudentClient sssc = new StudentClient();
	    	sssc.stuManagerIndex();
	    	break;
	    default :
	        break;
	    }
	}
}
