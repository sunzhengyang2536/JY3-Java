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
			if(M1.age >= 22 && M2.age >= 20 && M1.sex == '男'|| M2.age >= 22 && M1.age >= 20 && M2.sex == '男')
			{
				if(!M1.marry && !M2.marry)
				{
					M1.marry = true;
					M2.marry = true;
					M1.mate.name = M2.name;
					M2.mate.name = M1.name;
					System.out.println(M1.name+"的伴侣为:"+M1.mate.name);
					System.out.println(M2.name+"的伴侣为:"+M2.mate.name);
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
		Marry girl = new Marry("张家辉",'男',false,22,null);
		Marry boy = new Marry("古天乐",'女',false,20,girl);
		girl.mate = boy;
		boolean m = boy.marry(girl);
		System.out.print(m == true ? "喜结连理" : "分手快乐");
	}
}

