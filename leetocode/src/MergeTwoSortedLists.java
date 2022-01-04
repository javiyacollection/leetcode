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
class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1== null) return list2;
        if(list2== null) return list1;
        var node = new ListNode();
        var head = node;
        
        while(list1 != null || list2 != null ){
            if(list2 ==null || (list1 != null && list1.val<=list2.val)){
                node.next=list1;
                list1=list1.next;
            }else{
                node.next=list2;
                list2=list2.next;
            }
            node=node.next;
        }
        
        return head.next;
    }
}
