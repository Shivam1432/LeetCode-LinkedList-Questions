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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p=l1,q=l2;
        int count1=0,count2=0;
        while(p!=null)
        {
            count1++;
            p=p.next;
        }
        p=l1;
        while(q!=null)
        {
            count2++;
            q=q.next;
        }
        q=l2;
        if(count1==0 && count2==0)
        {
            return null;
        }
        if(count1==0)
        {
            return q;
        }
        if(count2==0)
        {
            return p;
        }
        else
        {
            ListNode head=new ListNode(0);
            ListNode curr=head;
            while(count1>0 && count2>0)
            {
                if(p.val<=q.val)
                {
                    curr.next=new ListNode(p.val);
                    p=p.next;
                    curr=curr.next;
                    count1--;
                }
                else
                {
                    curr.next=new ListNode(q.val);
                    q=q.next;
                    curr=curr.next;
                    count2--;
                }
            }
            while(count1>0)
            {
                curr.next=new ListNode(p.val);
                p=p.next;
                curr=curr.next;
                count1--;
            }
            while(count2>0)
            {
                curr.next=new ListNode(q.val);
                q=q.next;
                curr=curr.next;
                count2--;
            }
            return head.next;
        }
    }
}
