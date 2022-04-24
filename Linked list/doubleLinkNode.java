public class doubleLinkNode {
    public int data;
    public doubleLinkNode prev;
    public doubleLinkNode next;

    public doubleLinkNode(int x){
        data = x;
    }

    public static doubleLinkNode insertIntoBeginning(doubleLinkNode head, int valueToInsert){
        doubleLinkNode newNode = new doubleLinkNode(valueToInsert);

        newNode.next = head;
        head.prev = newNode;;
        head = newNode;

        return head;
    }

    public static doubleLinkNode insertNodeInMiddle(doubleLinkNode head,int position,int valueToInsert){
        doubleLinkNode newNode = new doubleLinkNode(valueToInsert);
        doubleLinkNode temp = head;

        for(int i=1;i<position;i++){
            temp = temp.next;
        }
        newNode.prev = temp;
        newNode.next = temp.next;

        temp.next = newNode;
        temp.next.prev = newNode;


        return head;

    }

    public static doubleLinkNode insertAtTheEnd(doubleLinkNode head,int valueToInsert){
        doubleLinkNode newNode = new doubleLinkNode(valueToInsert);
        doubleLinkNode temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }

    public static doubleLinkNode deleteFromBeginning(doubleLinkNode head){
        head = head.next;
        head.prev = null;
        return head;
    }

    public static doubleLinkNode deleteFromMiddle(doubleLinkNode head,int position){
        doubleLinkNode temp = head;
        for(int i=1;i<position;i++){
            temp = temp.next;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        return head;
    }

    public static doubleLinkNode deleteAtEnd(doubleLinkNode head){

        doubleLinkNode temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }

        temp.next = null;
        return head;

    }

    public static void traverseThroughList(doubleLinkNode head){
        doubleLinkNode temp = head;

        while(temp != null){
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] arg){
        doubleLinkNode l1 = new doubleLinkNode(4);
        doubleLinkNode l2 = new doubleLinkNode(5);
        doubleLinkNode l3 = new doubleLinkNode(6);

        l1.next = l2;
        l2.prev = l1;
        l2.next = l3;
        l3.prev = l2;
        doubleLinkNode Head = l1;


        traverseThroughList(Head);

       /* doubleLinkNode Head1 = insertIntoBeginning(Head,7);
        doubleLinkNode Head2 = insertNodeInMiddle(Head1,3,8);*/
        //doubleLinkNode Head3 = insertAtTheEnd(Head,9);

        //traverseThroughList(Head);

        //doubleLinkNode Head4 = deleteFromBeginning(Head3);
        //doubleLinkNode Head5 = deleteFromMiddle(Head3,3);
        doubleLinkNode Head6 = deleteAtEnd(Head);

        traverseThroughList(Head6);


    }

}
