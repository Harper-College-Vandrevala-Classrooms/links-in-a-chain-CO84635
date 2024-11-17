package main.java.com.csc;

public class LinksInAChain {

    static class Node {
        ChainLink data;
        Node next;

        Node(ChainLink data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        public void add(ChainLink data){
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;   
            }
        }

        public ChainLink get(int index) {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.data;
        }
    }

    static class ChainLink {
        public String color;

        ChainLink(String color) {
            this.color = color;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        ChainLink linkOne = new ChainLink("red");
        ChainLink linkTwo = new ChainLink("blue");
        ChainLink linkThree = new ChainLink("green");

        linkedList.add(linkOne);
        linkedList.add(linkTwo);
        linkedList.add(linkThree);

       ChainLink firstLink = linkedList.get(0);
       ChainLink secondLink = linkedList.get(1);

       System.out.println("First link color: " + firstLink.color);
       System.out.println("Second link color: " + secondLink.color);
    }
}
