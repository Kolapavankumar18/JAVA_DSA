class Node {
    int data;
    Node prev;
    Node next;
    Node(int d) {
        data = d;
        prev = next = null;
    }
}

class DeleteNodeAtPosition {

    public static Node delPos(Node head, int x) {
        
        if (head == null){
            return head; 
        }

        Node curr = head;
        for (int i = 1; curr != null && i < x; i++) {
            curr = curr.next;
        }

        if (curr == null){
            return head; 
        }
        if (curr.prev != null)
            curr.prev.next = curr.next;
        if (curr.next != null)
            curr.next.prev = curr.prev;
        if (head == curr)
            head = curr.next;
        
        curr = null; 
        return head;
    }
    
    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print(" <-> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;

        head = delPos(head, 2);

        printList(head);
    }
}
