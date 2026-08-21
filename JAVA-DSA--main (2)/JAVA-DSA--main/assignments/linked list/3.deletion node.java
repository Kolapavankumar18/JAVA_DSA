class Deletion {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node deleteFromBeginning(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }
        return head.next;
    }

    static Node deleteFromEnd(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }
        if (head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    static Node deleteValue(Node head, int key) {
        if (head == null) return null;

        if (head.data == key) {
            return head.next;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println(key + " not found");
            return head;
        }
        temp.next = temp.next.next;
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
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.print("Original List: ");
        printList(head);

        head = deleteFromBeginning(head);
        System.out.print("After delete from beginning: ");
        printList(head);

        head = deleteFromEnd(head);
        System.out.print("After delete from end: ");
        printList(head);

        head = deleteValue(head, 30);
        System.out.print("After delete value 30: ");
        printList(head);
    }
}
