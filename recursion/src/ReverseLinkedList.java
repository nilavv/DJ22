public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        if(head.next==null || head ==null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next=null;
        return p;
    }


}
