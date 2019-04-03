import java.util.*;
public class ScannerDemo
{
	public static void main(String[] args)
	{	
	    Scanner scanne = new Scanner(System.in);
	    System.out.print("请输入一个数字:");
        int num = scanne.nextInt();
		System.out.print("您输入的值:"+num);
	}
}