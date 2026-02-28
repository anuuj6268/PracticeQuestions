/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode mergeLL = new ListNode(-1);
        ListNode temp = mergeLL;
    while(head1!=null && head2!=null){
        if(head1.val<head2.val){
            temp.next = head1;
             temp = head1;
            head1 = head1.next; 
        }
        else{
            temp.next = head2;
            temp = head2;
            head2 = head2.next;
            
        }
    }
while(head1!=null){
temp.next = head1;
head1 = head1.next;
temp = temp.next;
}

while(head2!=null){
temp.next = head2;
head2 = head2.next;
temp = temp.next;
}
return mergeLL.next;

    }
}