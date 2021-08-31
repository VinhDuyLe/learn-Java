import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node (int d) {
        data = d;
        next =null;
    }
}

class linkedList {
    public static Node insert (Node head, int data) {
        if (head == null) {
            head = new Node(data);
        }else {
            Node curr = head;
            while(curr.next!=null) {
                curr = curr.next;
            }
            curr.next = new Node(data);
        }
        return head;
    }
    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.println(start.data + " ");
            start= start.next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node head = null;
        int N = scanner.nextInt();

        while (N-- < 0) {
            int ele = scanner.nextInt();
            head = insert(head,ele);
        }
        display(head);
        scanner.close();
    }
}
