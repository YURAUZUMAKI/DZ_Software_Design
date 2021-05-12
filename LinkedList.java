package Kee;
class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

}

class LinkedList {

    Node head;
    int size;

    public void add(int data) {
        if (head == null) {
            head = new Node(data);
            size += 1;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
        size += 1;
    }

    public int getSize() {
        return size;
    }

    public void add(int data, int index) {

        if (index > getSize()) {
            return;
        }

        Node current = head;
        int pos = 0;
        Node newNode = new Node(data);

        if (index == 0)
        {
            newNode.next = head;
            head = newNode;
            size += 1;
            return;
        }
        while (current.next != null) {
            if (pos == index - 1) {
                break;
            }
            pos++;
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
        size += 1;

    }


    public void print() {

        if(getSize() == 0) { //list is empty
            return;
        }
        Node current = head;
        while (current.next != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print(current.data + "\n");
    }


}


