import java.util.*;
public class Bubble
{
	public static void main(String[] args) 
	{
		int[] nums = {
			999,100,2,12
		};
		int[] newArr = bubbleSort(nums);
		System.out.print(Arrays.toString(newArr));
	}
	public static int[] bubbleSort(int[] nums)
    {
		for(int i=0;i<nums.length-1;i++)
		{
		    for (int j=0;j<nums.length-1-i ;j++ )
		    {
				if (nums[j]>nums[j+1])
				{
                    int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
		    }
		}
		return nums;
	}
}
