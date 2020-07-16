/**
 * 
 * Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

	After doing so, return the array.
	
	 
	
	Example 1:
	
	Input: arr = [17,18,5,4,6,1]
	Output: [18,6,6,6,1,-1]
	 
	
	Constraints:
	
	1 <= arr.length <= 10^4
	1 <= arr[i] <= 10^5
 */
package arrays;

/**
 * @author gsiddart
 *
 */
public class GreatestRightElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int[] replaceElements(int[] arr) {
	        int maxRightElement = -1;
	        int temp;
	        for(int i = arr.length - 1 ; i >= 0 ; i--)
	        {
	            temp = arr[i];
	            arr[i] = maxRightElement;
	            if(temp > maxRightElement)
	            {
	                maxRightElement = temp;
	            }
	            //System.out.println(i + " " + arr[i] + " " + temp + " " + maxRightElement+ " " + Arrays.toString(arr));
	        }
	        return arr;
	    }

}
