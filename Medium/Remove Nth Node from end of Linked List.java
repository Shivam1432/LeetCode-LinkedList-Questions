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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p=head;
        int count=0;
        while(p!=null)
        {
            count++;
            p=p.next;
        }
        p=head;
        int k=count-n;
        if(count==1 && n==1)
        {
            return null;
        }
        if(count==0)
        {
            return null;
        }
        if(k==0)
        {
            return head.next;
        }
        else
        {
            ListNode prev=head;
            int c=1;
            while(c<k)
            {
                prev=prev.next;
                c++;
            }
            ListNode cur=prev.next;
            prev.next=cur.next;
            cur.next=null;
            return head;
        }
    }
}
