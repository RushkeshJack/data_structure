public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x){
        val = x;
    }

    public static void tranverseALinkedList(ListNode head){
        ListNode temp = head;
        System.out.println();

        while(temp != null){
            System.out.print(temp.val + " ");
            //System.out.println(temp);
            temp = temp.next;
        }
    }

    public static ListNode deleteFromBeginning(ListNode head){
        head = head.next;
        return head;
    }

    public static ListNode deleteFromMiddle(ListNode head, int position){
        ListNode temp = head;

        for(int i=1;i<position-1;i++){
            temp = temp.next;
        }

        ListNode deleteNode = temp.next;
        ListNode nextToDeleteNode = deleteNode.next;
        temp.next = nextToDeleteNode;

        return head;
    }

    public static ListNode deleteFromEnd(ListNode head) {
        ListNode temp = head;

        if (temp.next != null) {
            while (temp.next.next != null) {
                temp = temp.next;
            }

            temp.next = null;
            return head;

        }
        else{
            return head;
        }
    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(8);
        ListNode l3 = new ListNode(5);
        ListNode l4 = new ListNode(7);
        ListNode l5 = new ListNode(3);

        ListNode Head = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = null;


        tranverseALinkedList(Head);

        /*ListNode Head1 = deleteFromBeginning(Head);

        tranverseALinkedList(Head1);

        ListNode Head2 = deleteFromMiddle(Head1,2);

        tranverseALinkedList(Head2);

        ListNode Head3 = deleteFromEnd(Head2);*/

        tranverseALinkedList(Head);

        /*ListNode ptr = l1;
        ListNode ptr2 = l2;
        ListNode ptr3 = l3;

        System.out.println(ptr);
        System.out.println(ptr2);
        System.out.println(ptr3);

        System.out.println(ptr.val);
        System.out.println(ptr2.val);
        System.out.println(ptr3.val);

        System.out.println(ptr.next);
        System.out.println(ptr2.next);
        System.out.println(ptr3.next);*/


    }
}

