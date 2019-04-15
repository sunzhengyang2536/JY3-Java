package com.neuedu.y20190412;

import java.util.Scanner;

public class Feibo {
	        
	public static int num(int i) 
	{
		if(i==1||i==2)
		{
			return 1;
		}
		return num(i-1)+num(i-2);
		
	}
    public static void main(String[] args) 
    {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("ÇëÊäÈë¸öÊı£º");
    	int a = scanner.nextInt();
    	for (int i = 1; i <= a; i++) 
    	{
		    System.out.print(num(i)+"\t");
	    }
    }
}
