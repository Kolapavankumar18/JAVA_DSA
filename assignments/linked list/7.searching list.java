class Searching {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static boolean search(Node head, int key) {
        Node temp = head;
        int position = 1;

        while (temp != null) {
            if (temp.data == key) {
                System.out.println(key + " found at position " + position);
                return true;
            }
            temp = temp.next;
            position++;
        }
        System.out.println(key + " not found in the list");
        return false;
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

        System.out.print("Linked List: ");
        printList(head);

        search(head, 30);
        search(head, 100);
        search(head, 10);
    }
}
