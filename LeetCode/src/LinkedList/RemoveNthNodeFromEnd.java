/**
 * Given a linked list, remove the n-th node from the end of list and return its head.

	Example:
	
	Given linked list: 1->2->3->4->5, and n = 2.
	
	After removing the second node from the end, the linked list becomes 1->2->3->5.
	Note:
	
	Given n will always be valid.
	
	Follow up:
	
	Could you do this in one pass?
 */
package LinkedList;

import LinkedList.LinkedListCycle_I.ListNode;

/**
 * @author gsiddart
 *
 */
public class RemoveNthNodeFromEnd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        ListNode NthNode = null;
        ListNode previous = null;
        int count = 0;
        while(curr != null)
        {
            // System.out.print(curr.val + " " );
            // if(NthNode == null)
            // {
            //     System.out.println("null");
            // }
            // else
            // {
            //     System.out.println(NthNode.val);
            // }
            curr = curr.next;
            count++;
            if(count == n)
            {
                NthNode = head;
            }
            else if(count > n)
            {
                previous = NthNode;
                NthNode = NthNode.next;
            }
        }
        
        if(previous != null && NthNode != null)
        {
            previous.next = NthNode.next;
            return head;
        }
        if(NthNode == head)
        {
            head = head.next;
            return head;
        }
        else
            return null;
    }

}
