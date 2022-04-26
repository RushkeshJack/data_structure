public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static void tranverseALinkedList(ListNode head){
        ListNode temp = head;

        while(temp != null){
            System.out.print(temp.val + " ");
            //System.out.print(temp+"    ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class reverseLinkedList {

    public static void main(String[] arg){

        ListNode n1 = new ListNode(4);
        ListNode n2 = new ListNode(5);
        ListNode n3 = new ListNode(6);
        ListNode n4 = new ListNode(9);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
        ListNode Head = n1;
        ListNode.tranverseALinkedList(Head);

        //Reversing the linked list through iterative method

        ListNode curr = Head,pre = null,next = null;

        while(curr != null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        
        ListNode newHead = pre;
        ListNode.tranverseALinkedList(newHead);

    }
}
