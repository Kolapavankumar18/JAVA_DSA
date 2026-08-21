import java.util.ArrayList;

class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int x)
    {
        data = x;
        next = prev = null;
    }
}

public class specificpositioninsert {

    public static Node insertAtPos(Node head, int p, int x)
    {

        // Store all nodes in an array
        ArrayList<Node> nodes = new ArrayList<>();
        Node curr = head;

        while (curr != null) {
            nodes.add(curr);
            curr = curr.next;
        }

        // Create new node
        Node newNode = new Node(x);

        // Get p-th node
        Node pNode = nodes.get(p);

        // Insert new node
        newNode.next = pNode.next;
        newNode.prev = pNode;

        if (pNode.next != null)
            pNode.next.prev = newNode;

        pNode.next = newNode;

        return head;
    }

    // Function to print the doubly linked list
    public static void printList(Node head)
    {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null)
                System.out.print(" <-> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {

        // Creating linked list: 2 <-> 4 <-> 5
        Node head = new Node(2);
        head.next = new Node(4);
        head.next.prev = head;
        head.next.next = new Node(5);
        head.next.next.prev = head.next;

        int p = 2, x = 6;

        head = insertAtPos(head, p, x);

        printList(head);
    }
}
