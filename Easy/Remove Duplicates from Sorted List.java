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
    public ListNode deleteDuplicates(ListNode head) {
        TreeSet<Integer> set=new TreeSet<Integer>();
        ListNode p=head;
        while(p!=null)
        {
            set.add(p.val);
            p=p.next;
        }
        p=head;
        int size=set.size();
        ListNode h=new ListNode(0);
        ListNode cur=h;
        Iterator<Integer> itr=set.iterator();  
        while(itr.hasNext()){  
            int val=(int)itr.next();
            cur.next=new ListNode(val);
            cur=cur.next;
        }  
        return h.next;
    }
}
