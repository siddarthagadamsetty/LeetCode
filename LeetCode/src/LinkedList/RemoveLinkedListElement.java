/**
 * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

 

Example 1:


Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
 */
package LinkedList;

import LinkedList.LinkedListCycle_I.ListNode;

/**
 * @author gsiddart
 *
 */
public class RemoveLinkedListElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode removeElements(ListNode head, int val) {
        // ListNode prev = null;
        ListNode curr = head;
        
        while(head != null && head.val == val)
        {
            head = head.next;
        }

        while(curr != null && curr.next != null)
        {
            if(curr.next.val == val)
            {
                curr.next = curr.next.next;
            }
            else
            {
                curr = curr.next;
            }
            
        }
        return head;
    }
	class ListNode 
	{
		int val;
		ListNode next;
		ListNode(int x) 
		{
			val = x;
			next = null;
		}
	}

}
