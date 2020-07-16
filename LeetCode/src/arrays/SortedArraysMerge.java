/**
 * 
 * 
 */
package arrays;

/**
 * @author gsiddart
 *
 */
public class SortedArraysMerge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < m && j < n)
        {
            if(nums1[k] < nums2[j])
            {
                i++;
            }
            else
            {
                InsertAndShiftRight(nums1, k, nums2[j]);
                j++;
            }
            k++;
            // System.out.println("i: " + i + " *** j: " + j + " *** k: " + k);
            // System.out.println(Arrays.toString(nums1));
        }
        
        while(j < n && k < m + n)
        {
            nums1[k] = nums2[j];
            k++;
            j++;
        }
        
    }
    
    public void InsertAndShiftRight(int[] arr, int startIndex, int insertNumber)
    {
        for(int j = startIndex ; j < arr.length ; j++)
        {
            int val = arr[j];
            arr[j] = insertNumber;
            insertNumber = val;
        }
    }
	
	public void mergeOptimisedVersion(int[] nums1, int m, int[] nums2, int n) {
        // 2 points
        // from last
        int i = m-1, j=n-1,k=m+n-1;
        while (i>=0 && j>=0) {
            if (nums1[i]>nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
           
        }
        while (i>=0) {
            nums1[k--] = nums1[i--];
        }
        while (j>=0) {
            nums1[k--] = nums2[j--];
        }
    }

}
