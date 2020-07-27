/**
 * 	Given a linked list, determine if it has a cycle in it.

	To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.
	
	 
	
	Example 1:
	
	Input: head = [3,2,0,-4], pos = 1
	Output: true
	Explanation: There is a cycle in the linked list, where tail connects to the second node.
	
	
	Example 2:
	
	Input: head = [1,2], pos = 0
	Output: true
	Explanation: There is a cycle in the linked list, where tail connects to the first node.
	
	
	Example 3:
	
	Input: head = [1], pos = -1
	Output: false
	Explanation: There is no cycle in the linked list.
	
	
	 
	
	Follow up:
	
	Can you solve it using O(1) (i.e. constant) memory?
	
	URL: https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1212/
 */
package LinkedList;

/**
 * @author gsiddart
 *
 */
public class LinkedListCycle_I {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public boolean hasCycle(ListNode head) {
	        
	        if (head == null || head.next == null) {
	            return false;
	        }
	        
	        ListNode slow = head;
	        ListNode fast = head;
	        
	        while (fast != null && fast.next != null) { 
	            slow = slow.next;
	            fast = fast.next.next;
	            if (slow == fast) return true;
	        }
	        return false;
	    }
	
public boolean hasCycle1(ListNode head) {
        
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while(true)
        {
            if(slowPointer == null)
            {
                break;
            }
            else
            {
                fastPointer = fastPointer.next;
                if(fastPointer == null)
                {
                    break;
                }
                else 
                {
                    if(fastPointer.next != null)
                    {
                        fastPointer = fastPointer.next;
                        if(slowPointer == fastPointer)
                        {
                            //System .out.println(slowPointer.val);
                            return true;
                        }
                        //System .out.println(slowPointer.val + " " + fastPointer.val);
                        slowPointer = slowPointer.next;
                    }
                    else
                    {
                        break;
                    }
                }

                //System .out.println(slowPointer.val + " " + fastPointer.val);
            }
        }       
        return false;
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
