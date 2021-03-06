/**
 * 
 * Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.

	Example 1:
	
	Input: [-4,-1,0,3,10]
	Output: [0,1,9,16,100]
	
	Example 2:
	
	Input: [-7,-3,2,3,11]
	Output: [4,9,9,49,121]
 */
package arrays;

import java.util.Arrays;

/**
 * @author gsiddart
 *
 */
public class SquaresOfSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] sortedSquares(int[] A) {
        int[] squares = new int[A.length];
        for(int i = 0 ; i < A.length ; i++)
        {
            squares[i] = A[i] * A[i];
        }
        Arrays.sort(squares);
        return squares;
    }

}
