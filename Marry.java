package ccc;

import java.util.Scanner;

public class Marry {
	int num;
	String name;
	char sex;
	String adress;
	long tel;
	long id;
	boolean marry;
	int age;
	Marry mate;
//
	public Marry(String name,char sex,boolean marry,int age,Marry mate)
	{
		this.num = num;
		this.name = name;
		this.sex = sex;
		this.adress = adress;
		this.tel = tel;
		this.id = id;
		this.marry = marry;
		this.age = age;
		this.mate = mate;
	}
	//
	public boolean MarryRules(Marry M1,Marry M2)
	{
		if(M1.sex != M2.sex)
		{
			if(M1.age >= 22 && M2.age >= 20 && M1.sex == '��'|| M2.age >= 22 && M1.age >= 20 && M2.sex == '��')
			{
				if(!M1.marry && !M2.marry)
				{
					M1.marry = true;
					M2.marry = true;
					M1.mate.name = M2.name;
					M2.mate.name = M1.name;
					System.out.println(M1.name+"�İ���Ϊ:"+M1.mate.name);
					System.out.println(M2.name+"�İ���Ϊ:"+M2.mate.name);
					return true;	
				}
			}
		}
		return false;
	}
	//
	public boolean marry(Marry Marry2)
	{
		boolean marryRules = MarryRules(this,Marry2);
		return marryRules;
    }
	//
	public static void main(String[] args) 
	{
		Marry girl = new Marry("�żһ�",'��',false,22,null);
		Marry boy = new Marry("������",'Ů',false,20,girl);
		girl.mate = boy;
		boolean m = boy.marry(girl);
		System.out.print(m == true ? "ϲ������" : "���ֿ���");
	}
}

