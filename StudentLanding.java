import java.util.*;

public class StudentLanding {
	static int id;
	static String name;
	static String sex;
	static int age;
	static String grade;
	static String adress;
	static int tel;
	static String email;
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print("-");
		}
		System.out.print("欢迎来到学生管理系统  ");
		for (int i = 0; i < 10; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println("1.登陆                      2.退出");
		for (int i = 0; i < 34; i++) {
			System.out.print("-");
		}
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.print("请选择");
		int num1 = scanner.nextInt();
		switch (num1) {
		case 1:
			System.out.println("欢迎登陆!");
			Landing user = new Landing();
			Scanner scanner1 = new Scanner(System.in);
			System.out.print("请输入用户名:");
			String username1 = scanner1.next();
			System.out.print("请输入密码:");
			String password1 = scanner1.next();
			boolean checkUser = user.checkUser(username1, password1);
			if (checkUser == true) {
				System.out.println("登陆成功");
				System.out.println("欢迎您，admin");
				while (true) 
				{
					for (int i = 0; i < 15; i++) {
						System.out.print("*");
					}
				    System.out.print("请选择要操作的信息对应数字  ");
				    for (int i = 0; i < 15; i++) {
					    System.out.print("*");
				    }
				    System.out.println();
				    System.out.print("*");
				    System.out.print("1.查看学生信息 2.添加学生信息 3.删除学生信息 4.修改学生信息 5.退出");
				    System.out.println("*");
				    for (int i = 0; i < 48; i++) {
					    System.out.print("*");
				    }
				    System.out.println();
				    Scanner scanner2 = new Scanner(System.in);
					System.out.print("请选择");
					int num2 = scanner2.nextInt();
					switch (num2) {
					case 1:
						System.out.println("学生id为:"+id);
						break;
					case 2:
						Scanner scanner3 = new Scanner(System.in);
						System.out.println("请输入学生id:");
						id = scanner3.nextInt();
						Scanner scanner4 = new Scanner(System.in);
						System.out.println("请输入学生姓名:");
						name = scanner4.next();
						Scanner scanner5 = new Scanner(System.in);
						System.out.println("请输入学生性别:");
						sex = scanner5.next();
						Scanner scanner6 = new Scanner(System.in);
						System.out.println("请输入学生年龄:");
						age = scanner6.nextInt();
						Scanner scanner7 = new Scanner(System.in);
						System.out.println("请输入学生班级:");
						grade = scanner7.next();
						Scanner scanner8 = new Scanner(System.in);
						System.out.println("请输入学生住址:");
						adress = scanner8.next();
						Scanner scanner9 = new Scanner(System.in);
						System.out.println("请输入学生电话:");
						tel = scanner9.nextInt();
						Scanner scanner10 = new Scanner(System.in);
						System.out.println("请输入学生邮箱:");
						email = scanner10.next();
						System.out.println("数据保存成功，系统将自动返回上层目录");
					case 3:
						
						break;
					case 4:
						while(true)
						{
						for (int i = 0; i < 58; i++) {
						    System.out.print("-");
					    }
						System.out.println();
						System.out.println("1.根据ID修改学生全部信息      2.根据ID修改学生部分信息      3.返回上级目录      4.系统退出");
						for (int i = 0; i < 58; i++) {
						    System.out.print("-");
					    }
						System.out.println();
						System.out.print("请选择");
						Scanner scanner11 = new Scanner(System.in);
						int num3 = scanner11.nextInt();
						switch (num3) {
						    case 2 :
						    Scanner scanner12 = new Scanner(System.in);
						    System.out.println("请输入要修改的id");
						    int id2 = scanner12.nextInt();
						    id = id2;
						    Scanner scanner13 = new Scanner(System.in);
						    System.out.println("请输入要修改的属性");
						    String shuxing = scanner13.next();
						    
						    Scanner scanner14 = new Scanner(System.in);
						    System.out.println("请输入修改后的数据");
						    int age3 = scanner14.nextInt();
						    age = age3;
						    System.out.println("修改成功");
						    System.out.println("系统自动返回上层目录......");
						    break;
						    case 1 :
						    	while(true)
						    	{
						    	for (int i = 0; i < 58; i++) {
								    System.out.print("+");
							    }
								System.out.println();
								System.out.println("1.查看所有学生信息     2.根据id查询学生信息      3.根据id查询学生姓名       4.返回上一级");
								for (int i = 0; i < 58; i++) {
								    System.out.print("+");
							    }
								System.out.println();
								Scanner scanner15 = new Scanner(System.in);
								System.out.println("请选择菜单:");
								int num4 = scanner15.nextInt();
								switch(num4)
								{
								case 2 :
									Scanner scanner16 = new Scanner(System.in);
									System.out.println("请输入要查询的id:");
									int num7 = scanner16.nextInt();
									for (int i = 0; i < 30; i++) {
									    System.out.print("-");
								    }
									System.out.print("所有学生信息");
									for (int i = 0; i < 30; i++) {
									    System.out.print("-");
								    }
									System.out.println();
									System.out.println("|学号    |姓名     |年龄     |性别     |年级     |电话                                |EMALL            |地址                   ");
									for (int i = 0; i < 68; i++) {
									    System.out.print("-");
								    }
									System.out.println();
									System.out.println("|"+id+"|"+name+"|"+age+"|"+sex+"|"+grade+"|"+tel+"|"+email+"|"+adress );
									for (int i = 0; i < 68; i++) {
									    System.out.print("-");
								    }
									System.out.println();
									System.out.println("数据查询完毕，系统将自动返回目录......");
									break;
								}
						    	}
						}
						}
						
					}
					if(num2 == 5) {
						break;
					}
				}
			} else {
				System.out.print("登陆失败");
			}
		case 2:
			break;
		}
	}
}
class Landing{
	String[] username;
	String[] password;
	public Landing() {
		username = new String[]{"admin"};
		password = new String[]{"admin"};
	}
	public boolean checkUser(String username1,String password1) 
	{
		for(int i=0;i<username.length;i++) 
		{
			if(username[i].equals(username1) && password[i].equals(password1))
			{
				return true;
			}
		}
		return false;
	}
	
}
