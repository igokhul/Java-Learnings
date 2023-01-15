class Node {
    int data;
    Node next;
}

class LinkedList99 {

    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void inserAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        Node n = head;
        node.next = n;
        head = node;
    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0) {
            inserAtStart(data);
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void deleteAt(int index) {

        Node n = head;

        if (index == 0) {
            head = head.next;
        } else {
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }

            Node tempN1 = n.next;
            n.next = tempN1.next;
        }

    }

    public void show() {
        Node node = head;

        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}

public class dumy {
    public static void main(String[] args) {

        LinkedList99 list = new LinkedList99();

        list.insert(5);
        list.insert(6);
        list.insert(7);

        list.inserAtStart(8);
        list.insertAt(0, 12);
        list.deleteAt(3);
 
        list.show();
    }
}
