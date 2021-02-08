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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        int[] a=new int[n-m+1];
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        ListNode p=head;
        int count=0,i=0,c=0;
        while(p!=null)
        {
            count++;
            if(count>=m && count<=n && i<=(n-m))
            {
                a[i]=p.val;
                i++;
            }
            p=p.next;
        }
        p=head;
        int l=a.length-1;
        while(p!=null)
        {
            ++c;
            if(c>=m && c<=n && l>=0)
            {
                curr.next=new ListNode(a[l]);
                curr=curr.next;
                l--;
                p=p.next;
            }
            else
            {
                curr.next=new ListNode(p.val);
                curr=curr.next;
                p=p.next;
            }
        }
        return dummy.next;
    }
}
