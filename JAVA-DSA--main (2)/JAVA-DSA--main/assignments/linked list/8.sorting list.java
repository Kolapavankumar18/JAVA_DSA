class Sorting {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void sort(Node head) {
        if (head == null || head.next == null) return;

        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            while (current.next != null) {
                if (current.data > current.next.data) {
                    // Swap data
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
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
        Node head = new Node(40);
        head.next = new Node(10);
        head.next.next = new Node(50);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(30);

        System.out.print("Before Sorting: ");
        printList(head);

        sort(head);

        System.out.print("After Sorting:  ");
        printList(head);
    }
}
