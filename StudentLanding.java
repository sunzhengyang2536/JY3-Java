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
		System.out.print("��ӭ����ѧ������ϵͳ  ");
		for (int i = 0; i < 10; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println("1.��½                      2.�˳�");
		for (int i = 0; i < 34; i++) {
			System.out.print("-");
		}
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.print("��ѡ��");
		int num1 = scanner.nextInt();
		switch (num1) {
		case 1:
			System.out.println("��ӭ��½!");
			Landing user = new Landing();
			Scanner scanner1 = new Scanner(System.in);
			System.out.print("�������û���:");
			String username1 = scanner1.next();
			System.out.print("����������:");
			String password1 = scanner1.next();
			boolean checkUser = user.checkUser(username1, password1);
			if (checkUser == true) {
				System.out.println("��½�ɹ�");
				System.out.println("��ӭ����admin");
				while (true) 
				{
					for (int i = 0; i < 15; i++) {
						System.out.print("*");
					}
				    System.out.print("��ѡ��Ҫ��������Ϣ��Ӧ����  ");
				    for (int i = 0; i < 15; i++) {
					    System.out.print("*");
				    }
				    System.out.println();
				    System.out.print("*");
				    System.out.print("1.�鿴ѧ����Ϣ 2.���ѧ����Ϣ 3.ɾ��ѧ����Ϣ 4.�޸�ѧ����Ϣ 5.�˳�");
				    System.out.println("*");
				    for (int i = 0; i < 48; i++) {
					    System.out.print("*");
				    }
				    System.out.println();
				    Scanner scanner2 = new Scanner(System.in);
					System.out.print("��ѡ��");
					int num2 = scanner2.nextInt();
					switch (num2) {
					case 1:
						System.out.println("ѧ��idΪ:"+id);
						break;
					case 2:
						Scanner scanner3 = new Scanner(System.in);
						System.out.println("������ѧ��id:");
						id = scanner3.nextInt();
						Scanner scanner4 = new Scanner(System.in);
						System.out.println("������ѧ������:");
						name = scanner4.next();
						Scanner scanner5 = new Scanner(System.in);
						System.out.println("������ѧ���Ա�:");
						sex = scanner5.next();
						Scanner scanner6 = new Scanner(System.in);
						System.out.println("������ѧ������:");
						age = scanner6.nextInt();
						Scanner scanner7 = new Scanner(System.in);
						System.out.println("������ѧ���༶:");
						grade = scanner7.next();
						Scanner scanner8 = new Scanner(System.in);
						System.out.println("������ѧ��סַ:");
						adress = scanner8.next();
						Scanner scanner9 = new Scanner(System.in);
						System.out.println("������ѧ���绰:");
						tel = scanner9.nextInt();
						Scanner scanner10 = new Scanner(System.in);
						System.out.println("������ѧ������:");
						email = scanner10.next();
						System.out.println("���ݱ���ɹ���ϵͳ���Զ������ϲ�Ŀ¼");
					case 3:
						
						break;
					case 4:
						while(true)
						{
						for (int i = 0; i < 58; i++) {
						    System.out.print("-");
					    }
						System.out.println();
						System.out.println("1.����ID�޸�ѧ��ȫ����Ϣ      2.����ID�޸�ѧ��������Ϣ      3.�����ϼ�Ŀ¼      4.ϵͳ�˳�");
						for (int i = 0; i < 58; i++) {
						    System.out.print("-");
					    }
						System.out.println();
						System.out.print("��ѡ��");
						Scanner scanner11 = new Scanner(System.in);
						int num3 = scanner11.nextInt();
						switch (num3) {
						    case 2 :
						    Scanner scanner12 = new Scanner(System.in);
						    System.out.println("������Ҫ�޸ĵ�id");
						    int id2 = scanner12.nextInt();
						    id = id2;
						    Scanner scanner13 = new Scanner(System.in);
						    System.out.println("������Ҫ�޸ĵ�����");
						    String shuxing = scanner13.next();
						    
						    Scanner scanner14 = new Scanner(System.in);
						    System.out.println("�������޸ĺ������");
						    int age3 = scanner14.nextInt();
						    age = age3;
						    System.out.println("�޸ĳɹ�");
						    System.out.println("ϵͳ�Զ������ϲ�Ŀ¼......");
						    break;
						    case 1 :
						    	while(true)
						    	{
						    	for (int i = 0; i < 58; i++) {
								    System.out.print("+");
							    }
								System.out.println();
								System.out.println("1.�鿴����ѧ����Ϣ     2.����id��ѯѧ����Ϣ      3.����id��ѯѧ������       4.������һ��");
								for (int i = 0; i < 58; i++) {
								    System.out.print("+");
							    }
								System.out.println();
								Scanner scanner15 = new Scanner(System.in);
								System.out.println("��ѡ��˵�:");
								int num4 = scanner15.nextInt();
								switch(num4)
								{
								case 2 :
									Scanner scanner16 = new Scanner(System.in);
									System.out.println("������Ҫ��ѯ��id:");
									int num7 = scanner16.nextInt();
									for (int i = 0; i < 30; i++) {
									    System.out.print("-");
								    }
									System.out.print("����ѧ����Ϣ");
									for (int i = 0; i < 30; i++) {
									    System.out.print("-");
								    }
									System.out.println();
									System.out.println("|ѧ��    |����     |����     |�Ա�     |�꼶     |�绰                                |EMALL            |��ַ                   ");
									for (int i = 0; i < 68; i++) {
									    System.out.print("-");
								    }
									System.out.println();
									System.out.println("|"+id+"|"+name+"|"+age+"|"+sex+"|"+grade+"|"+tel+"|"+email+"|"+adress );
									for (int i = 0; i < 68; i++) {
									    System.out.print("-");
								    }
									System.out.println();
									System.out.println("���ݲ�ѯ��ϣ�ϵͳ���Զ�����Ŀ¼......");
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
				System.out.print("��½ʧ��");
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
