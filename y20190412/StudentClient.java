package com.neuedu.y20190412;

import java.util.*;

public class StudentClient {
	static String userName = "admin";
	static String passWord = "admin";
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("*************��ӭ����ѧ������ϵ*************");
		System.out.println("1.��½                             2.�˳�");
		System.out.println("********************************************");
		StudentClient StudentClient = new StudentClient();
		StudentClient.welcomePage();
	}
	
	StudentManage sm =  new StudentManage(this);

	public void welcomePage() {
		System.out.println("��ѡ��");
		int c = scanner.nextInt();
		switch (c) {
		case 1:
			System.out.println("��ӭ��½");
			System.out.println("�������û���");
			String usn = scanner.next();
			System.out.println("����������");
			String psw = scanner.next();
			Admin admin = new Admin(usn, psw);
			boolean l = login(admin);
			if (l = true) {
				System.out.println("��ӭ����" + usn);
				stuManagerIndex();
			} else {
				welcomePage();
			}
			break;
		case 2:
			exit();
		default:
			System.out.println("��������������ѡ��");
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
		System.out.println("***************��ѡ����Ҫ��������Ϣ����Ӧ������  ***************");
		System.out.println("*1.�鿴ѧ����Ϣ   2.���ѧ����Ϣ    3.ɾ��ѧ����Ϣ    4.�޸�ѧ����Ϣ     5.�˳�*");
		System.out.println("****************************************************");
	    System.out.println("��ѡ��");
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
	        System.out.println("������Ҫɾ����id");
	    	int stuId = scanner.nextInt();
			sm.del(stuId);
	        break;
	    case 4:
	    	System.out.println("������Ҫ�޸ĵ�id");
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
