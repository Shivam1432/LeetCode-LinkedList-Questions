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
    public ListNode mergeKLists(ListNode[] lists) {
        int len=lists.length;
        ArrayList al=new ArrayList<Integer>();
        for(int i=0;i<len;i++)
        {
            ListNode p=lists[i];
            int l=0;
            while(p!=null)
            {
                l++;
                p=p.next;
            }
            p=lists[i];
            for(int j=0;j<l;j++)
            {
                al.add(p.val);
                p=p.next;
            }
        }
        Collections.sort(al);
        int size=al.size();
        ListNode head=new ListNode(0);
        ListNode d=head;
        for(int i=0;i<size;i++)
        {
            int val=(int)al.get(i);
            d.next=new ListNode(val);
            d=d.next;
        }
        return head.next;
    }
}
