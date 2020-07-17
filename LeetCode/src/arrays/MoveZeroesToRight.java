/**
 * 
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

	Example:
	
	Input: [0,1,0,3,12]
	Output: [1,3,12,0,0]
	Note:
	
	You must do this in-place without making a copy of the array.
	Minimize the total number of operations.
 */
package arrays;

/**
 * @author gsiddart
 *
 */
public class MoveZeroesToRight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void moveZeroes(int[] nums) {
        int zeroElementIndex = 0;
        int temp;
        for(int i = 0 ; i < nums.length; i++)
        {
            if(nums[i] != 0 && nums[zeroElementIndex] == 0)
            {
                temp = nums[i];
                nums[i] = nums[zeroElementIndex];
                nums[zeroElementIndex] = temp;
                zeroElementIndex++;
            }
            if(nums[i] == 0 && nums[zeroElementIndex] != 0)
            {
                zeroElementIndex = i;
            }
            //System.out.println("ZeroIndex: " + zeroElementIndex + "  i:" + i + " --> " + Arrays.toString(nums));
        }
    }

}
