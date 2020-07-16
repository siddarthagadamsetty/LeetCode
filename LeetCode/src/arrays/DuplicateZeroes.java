/*
 * 
 *  Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.

	Note that elements beyond the length of the original array are not written.
	
	Do the above modifications to the input array in place, do not return anything from your function.
	
	 
	
	Example 1:
	
	Input: [1,0,2,3,0,4,5,0]
	Output: null
	Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
	Example 2:
	
	Input: [1,2,3]
	Output: null
	Explanation: After calling your function, the input array is modified to: [1,2,3]
 */

package Arrays;

public class DuplicateZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void duplicateZeros(int[] arr) {
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == 0)
            {
                RotateArray(arr, i+1);
                //System.out.println(i + ":"  + Arrays.toString(arr));
                i++;
            }
            
        }
    }
    
    public void RotateArray(int[] arr, int startIndex)
    {
        int temp = 0;
        for(int j = startIndex ; j < arr.length ; j++)
        {
            int val = arr[j];
            arr[j] = temp;
            temp = val;
        }
    }

}
