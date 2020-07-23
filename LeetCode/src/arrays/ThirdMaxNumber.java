/*
 * Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

	Example 1:
	Input: [3, 2, 1]
	
	Output: 1
	
	Explanation: The third maximum is 1.
	Example 2:
	Input: [1, 2]
	
	Output: 2
	
	Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
	Example 3:
	Input: [2, 2, 3, 1]
	
	Output: 1
	
	Explanation: Note that the third maximum here means the third maximum distinct number.
	Both numbers with value 2 are both considered as second maximum.
 * 
 */
package arrays;

/**
 * @author gsiddart
 *
 */

public class ThirdMaxNumber {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,-2147483648,2};
		int thirdMaxValue = thirdMax(arr);
		System.out.println(thirdMaxValue);
	}
	
	public static int thirdMax(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        boolean hasIntMin = false;
        
        for(int i = 0 ;i < nums.length ; i++)
        {
            if(nums[i] == Integer.MIN_VALUE)
            {
                hasIntMin = true;
            }
            if(nums[i] >= max1)
            {
                if(nums[i] == max1)
                {
                    continue;
                }
                if(max2 > max3)
                {
                    max3 = max2;
                }
                if(max1 > max2)
                {
                    max2 = max1;
                }
                max1 = nums[i];
            }
            else if(nums[i] >= max2 && max2 < max1)
            {
                if(nums[i] == max2)
                {
                    continue;
                }
                if(max2 > max3)
                {
                    max3 = max2;
                }
                max2 = nums[i];
            }
            else if(nums[i] >= max3 && max3 < max2)
            {
                if(nums[i] == max3)
                {
                    continue;
                }
                max3 = nums[i];
            }
        }
        if(max2 == max3 || max1 == max2)
        {
            return max1;
        }
        else if(!hasIntMin && max3 == Integer.MIN_VALUE)
        {
            return max1;
        }
        else
        {
            return max3;
        }
    }
}
