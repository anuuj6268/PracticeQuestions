/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

        public int size(ListNode head){
            ListNode temp = head;
            int count = 0;




            while(temp!=null){
                temp = temp.next;
                count++;
            }
            return count;
        }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int countA = size(headA);
        int countB = size(headB);
        if(countA>countB){
            for(int i = 0;i<countA-countB;i++){
                temp1 = temp1.next;
            }
        }
        else{
                   for(int i = 0;i<countB-countA;i++){
                temp2 = temp2.next;
            }
        }
while(temp1!=temp2){
    temp1 = temp1.next;
    temp2 = temp2.next;
}

return temp1;
        }
    }
