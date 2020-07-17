/**
 * 
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

	You may return any answer array that satisfies this condition.
	
	 
	
	Example 1:
	
	Input: [3,1,2,4]
	Output: [2,4,3,1]
	The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
	
	
	Note:
	
	1 <= A.length <= 5000
	0 <= A[i] <= 5000
 */
package arrays;

/**
 * @author gsiddart
 *
 */
public class EvenOddArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] sortArrayByParity(int[] A) {
        for(int i = 0, j = A.length - 1 ; i < j ;)
        {
            if(A[i] % 2 != 0)
            {
                if(A[j] % 2 == 0)
                {
                    swapAtIndex(A, i, j);
                    j--;
                    i++;
                }
                else
                {
                    j--;
                }
            }
            else
            {
                i++;
            }
            //System.out.println("i: " + i + " j: " + j + " --> " + Arrays.toString(A));
        }
        return A;
    }
    
    public void swapAtIndex(int[] A, int i, int j)
    {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

}
