package com.neuedu.y20190412;

public class Now 
{
	public static void main(String[] args) 
	{
		double time = System.currentTimeMillis();
		double i = time/1000/60/60/24/365 + 1970;
		System.out.print(i);
	}
}
