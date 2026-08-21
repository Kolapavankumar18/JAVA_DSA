class Insertion {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node insertAtBeginning(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    static Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) return newNode;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    static Node insertAtPosition(Node head, int data, int position) {
        if (position < 1) {
            System.out.println("Invalid position");
            return head;
        }
        if (position == 1) {
            return insertAtBeginning(head, data);
        }

        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of range");
            return head;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = null;

        head = insertAtEnd(head, 10);
        head = insertAtEnd(head, 20);
        head = insertAtEnd(head, 30);
        System.out.print("After insert at end: ");
        printList(head);

        head = insertAtBeginning(head, 5);
        System.out.print("After insert at beginning: ");
        printList(head);

        head = insertAtPosition(head, 15, 3);
        System.out.print("After insert at position 3: ");
        printList(head);
    }
}
