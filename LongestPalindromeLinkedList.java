/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {

    /**
     *   Intution is to validate each position as the middle of the Palindromic List and move ahead with exploration on both side
     *         Explore till it is Palindromic  <--  [x] --> Explore till it is Palindromic
     *
     *   For the current position Every possible Palindromic List can be of Even Length Size or Odd Length size. 
     *
     *   Case-1 [Odd Length] :  Consider the current position as Middle element and try to explore from it's next element in both side
     *                          Till both the elements on each side is same.
     *
     *   Case-2 [Even Length] :  Consider the current position & Next element as Middle element and try to explore from 
     *                           it's next element in both side till both the elements on each side is same.
     *
     *   Approach: As we have to go backward and it is a singly Linked List, while exloring each element we will make the List reverse.
     *             Like for  1 -> 2 -> 3 -> null  
     *              Step-1:  null <- 1   &    2 -> 3 -> null. 
     *              Step-2:  null <- 1 <- 2   &   3 -> null
     */
     public int solve(ListNode A) {
 
         int maxLength = 1; // All Single element itself is Palindromic
 
         /**
         *   For the First Node changing the order and Making the First element in reverse Order
         *    1 -> 2 -> 3  changing it to    null <- 1   &  2 -> 3
         */
         ListNode reverseListStart = A;
         ListNode nextNode = reverseListStart.next;
         reverseListStart.next = null;
 
 
         while(nextNode != null){
 
             int oddLength = validateForOddLength(reverseListStart, nextNode);
             maxLength = Math.max(maxLength, oddLength);
 
             int evenLength = validateForEvenLength(reverseListStart, nextNode);
             maxLength = Math.max(maxLength, evenLength);
 
             /**
             *   Adding the current Node to the reverse list.
             */
             ListNode current = nextNode;
             nextNode = nextNode.next;
             current.next = reverseListStart;
             reverseListStart = current;
         }
 
         return maxLength;
     }
 
 
     /**
     *   For Odd Length current element is the Middle one, hence initial length is 1 and further we will explore both the side.
     *   Explore till it is Palindromic  <--  [x] --> Explore till it is Palindromic
     */
     private int validateForOddLength(ListNode node1, ListNode node2){
         
         int length = 1;
         ListNode current = node1;
         ListNode nextNode = node2.next;  
 
         while(current != null && nextNode != null && current.val == nextNode.val){
             current = current.next;
             nextNode = nextNode.next;
             length = length + 2; // +2 as two elements are mathched one in left & other in right side of the current element
         }
 
         return length;
     }
 
 
     /**
     *   For Even Length, current element & next element is the Middle one, 
     *   and if both are same further we will explore both the side. Hence initial length is 0.
     *   Explore till it is Palindromic  <--  [x][y] --> Explore till it is Palindromic
     */
     private int validateForEvenLength(ListNode node1, ListNode node2){
         
         int length = 0;
         ListNode current = node1;
         ListNode nextNode = node2;  
 
         while(current != null && nextNode != null && current.val == nextNode.val){
             current = current.next;
             nextNode = nextNode.next;
             length = length + 2;
         }
 
         return length;
     }
 }