public class Y2019040202
{
	public static void main(String[] args)
	{
		int a = 1;
		a = ++a;
		a = a++;
		a = a++ + ++a;
        System.out.println(a-- + ++a + a++ + a);
        System.out.println(a);
	}
}