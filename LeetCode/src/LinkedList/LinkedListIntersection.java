/**
 * 
 * Write a program to find the node at which the intersection of two singly linked lists begins.

	For example, the following two linked lists:
	
	
	begin to intersect at node c1.
	
	 
	
	Example 1:
	
	
	Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
	Output: Reference of the node with value = 8
	Input Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect). From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
	 
	
	Example 2:
	
	
	Input: intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
	Output: Reference of the node with value = 2
	Input Explanation: The intersected node's value is 2 (note that this must not be 0 if the two lists intersect). From the head of A, it reads as [1,9,1,2,4]. From the head of B, it reads as [3,2,4]. There are 3 nodes before the intersected node in A; There are 1 node before the intersected node in B.
	 
	
	Example 3:
	
	
	Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
	Output: null
	Input Explanation: From the head of A, it reads as [2,6,4]. From the head of B, it reads as [1,5]. Since the two lists do not intersect, intersectVal must be 0, while skipA and skipB can be arbitrary values.
	Explanation: The two lists do not intersect, so return null.
	 
	
	Notes:
	
	If the two linked lists have no intersection at all, return null.
	The linked lists must retain their original structure after the function returns.
	You may assume there are no cycles anywhere in the entire linked structure.
	Each value on each linked list is in the range [1, 10^9].
	Your code should preferably run in O(n) time and use only O(1) memory.
 */
package LinkedList;

import LinkedList.LinkedListCycle_I.ListNode;

/**
 * @author gsiddart
 *
 */
public class LinkedListIntersection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode first = headA;
        ListNode second = headB; 
        if(first == null || second == null)
        {
            return null;
        }
        while(first != null)  
        {
            second = headB; 
            while(second != null)
            {
                if(first == second)
                    return first;
                second = second.next;
            }
            first = first.next;
        }
        return null;
    }
	
	public ListNode getIntersectionNode_Optimized(ListNode headA, ListNode headB) {
        ListNode first = headA;
        ListNode second = headB; 
        if(first == null || second == null)
        {
            return null;
        }
        int sizeA = 0;
        int sizeB = 0;
        int diff = 0;
        //find the lengths of the lists
        while(first != null)  
        {
            first = first.next;
            sizeA++;
        }
         while(second != null)  
        {
            second = second.next;
            sizeB++;
        }
        //Traverse the bigger list till the extra nodes so that from that point both the list will have same number of nodes
        first = headA;
        second = headB;
        
        if(sizeA > sizeB)
        {
            diff = sizeA - sizeB;
            while(diff > 0)
            {
                first = first.next;
                diff--;
            }
        }
        else
        {
            diff = sizeB - sizeA;
            while(diff > 0)
            {
                second = second.next;
                diff--;
            }
        }
        //once the bigger list is traversed from there both list lengths are same so simply if the nodes are equal we can return the equal node
        while(first != null && second != null)
        {
            if(first == second)
            {
                return first;
            }
            first = first.next;
            second = second.next;
        }
        
        return null;
    }

}
