class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
while(fast!=null && fast.next !=null){
    slow = slow.next;
    fast = fast.next.next;
}

ListNode prev = null;
ListNode curr = slow;

while(curr!=null){
ListNode next = curr.next;
curr.next = prev;
prev = curr;
curr = next;
}
ListNode first = head;
ListNode second = prev;
while(second!=null){
    if(second.val != first.val) return false;

    second = second.next;
    first = first.next;
}
return true;
    }
}