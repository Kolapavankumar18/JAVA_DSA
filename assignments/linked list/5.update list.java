class Updation {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Update the first occurrence of oldValue with newValue
    static void update(Node head, int oldValue, int newValue) {
        Node temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.data == oldValue) {
                temp.data = newValue;
                found = true;
                break;          // remove this line if you want to update all occurrences
            }
            temp = temp.next;
        }

        if (found) {
            System.out.println("Updated " + oldValue + " to " + newValue);
        } else {
            System.out.println(oldValue + " not found in the list");
        }
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

        update(head, 30, 35);     // update 30 → 35
        System.out.print("After Updation: ");
        printList(head);

        update(head, 100, 99);    // value not present
    }
}
