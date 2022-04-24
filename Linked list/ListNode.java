public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x){
        val = x;
    }

    public static ListNode insertNodeInBeginning(int valueForNewNode,ListNode head){
        //System.out.println(newHead +" "+ head);
        ListNode newHead = new ListNode(valueForNewNode);
        newHead.next = head;
        head = newHead;
        return head;

    }

    public static ListNode insertNodeInMiddle(int valueForNewNode,ListNode head,int position){
        ListNode newNode = new ListNode(valueForNewNode);
        ListNode temp = head;
        for(int i=1;i<position;i++){
            temp = temp.next;
        }

        ListNode nextNodeOfNewNode = temp.next;
        temp.next = newNode;
        newNode.next = nextNodeOfNewNode;

        return head;
    }

    public static ListNode insertNewNodeAtEnd(int valueForNewNode,ListNode head){
        ListNode newNode = new ListNode(valueForNewNode);
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }



    public static void tranverseALinkedList(ListNode head){
        ListNode temp = head;
        System.out.println();

        while(temp != null){
            System.out.print(temp.val + " ");
            //System.out.print(temp+"    ");
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

        temp.next = temp.next.next;

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

        ListNode Head = l1;



        tranverseALinkedList(Head);

        /*ListNode Head1 = deleteFromBeginning(Head);

        tranverseALinkedList(Head1);

        ListNode Head2 = deleteFromMiddle(Head1,2);

        tranverseALinkedList(Head2);

        ListNode Head3 = deleteFromEnd(Head2);*/

        Head = insertNodeInBeginning(15,Head);
        Head = insertNodeInBeginning(19,Head);

        Head = insertNodeInMiddle(49,Head,2);

        //Head = insertNewNodeAtEnd(9,Head);

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

