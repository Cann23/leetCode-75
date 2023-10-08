package leetCode75;


class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class DeleteTheMiddleNodeOfALinkedList_2095 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(7);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next = new ListNode(6);

        ListNode head2 = new ListNode(1);

        System.out.println(deleteMiddle(head));
    }

    public static ListNode deleteMiddle(ListNode head) {
        ListNode listNode = head;
        ListNode deleteNode = head;

        int size = 1;

        while (listNode.next != null) {
            listNode = listNode.next;
            size++;
        }

        int medium = size / 2;

        if (medium == 0 ) {
            return null;
        }

        for (int i = 0; i < medium - 1;i++) {
            deleteNode = deleteNode.next;
        }

//        if (deleteNode.next != null && deleteNode.next.next != null) {
//            deleteNode.next = deleteNode.next.next;
//        }


        return head;
    }
}
