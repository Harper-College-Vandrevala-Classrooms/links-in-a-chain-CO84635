package com.csc;

public class LinksInAChain {

    static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList<T> {
        Node<T> head;

        private int size_total() {
            int size = 0;
            Node<T> current = head;
            while (current != null) {
                current = current.next;
                size++;
            }
            return size;
        }

        public int size(Node<T> node) {
            int size = 0;

            if (node == null){
                return 0;
            }
            
            Node<T> current = node.next;

            while (current != null) {
                ++size;
                current = current.next;
            }

            return size;
        }

        public void add(T data){
            
            Node<T> newNode = new Node<>(data);
            if (head == null) {
                head = newNode;
            } else {
                Node<T> current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;   
            }
        }

        public T get(int index) {
            if (index < 0 || index >= size_total()) {
                return null;
            }

            Node<T> current = head;
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

    static class StrawHats {
        public String name;

        StrawHats(String name) {
            this.name = name;
        }
    } 

    static class ComputerParts {
        public String part;

        ComputerParts(String part){
            this.part = part;
        }
    }

    public static void main(String[] args) {
        {
            LinkedList<ChainLink> linkedList = new LinkedList<>();

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

        {
            LinkedList<StrawHats> linkedList = new LinkedList<>();

            StrawHats linkOne = new StrawHats("Luffy");
            StrawHats linkTwo = new StrawHats("Zoro");
            StrawHats linkThree = new StrawHats("Nami");
            StrawHats linkFour = new StrawHats("Usopp");
            StrawHats linkFive = new StrawHats("Sanji");
            StrawHats linkSix = new StrawHats("Chopper");
            StrawHats linkSeven = new StrawHats("Robin");
            StrawHats linkEight = new StrawHats("Franky");
            StrawHats linkNine = new StrawHats("Brook");
            StrawHats linkTen = new StrawHats("Jinbei");

            linkedList.add(linkOne);
            linkedList.add(linkTwo);
            linkedList.add(linkThree);
            linkedList.add(linkFour);
            linkedList.add(linkFive);
            linkedList.add(linkSix);
            linkedList.add(linkSeven);
            linkedList.add(linkEight);
            linkedList.add(linkNine);
            linkedList.add(linkTen);

            StrawHats firstLink = linkedList.get(0);
            StrawHats secondLink = linkedList.get(1);
            StrawHats thirdLink = linkedList.get(2);
            StrawHats fourthLink = linkedList.get(3);
            StrawHats fifthLink = linkedList.get(4);
            StrawHats sixthLink = linkedList.get(5);
            StrawHats seventhLink = linkedList.get(6);
            StrawHats eigthLink = linkedList.get(7);
            StrawHats ninthLink = linkedList.get(8);
            StrawHats tenthLink = linkedList.get(9);

            System.out.println("First link Strawhat: " + firstLink.name);
            System.out.println("Second link Strawhat: " + secondLink.name);
            System.out.println("Third link Strawhat: " + thirdLink.name);
            System.out.println("Fourth link Strawhat: " + fourthLink.name);
            System.out.println("Fifth link Strawhat: " + fifthLink.name);
            System.out.println("Sixth link Strawhat: " + sixthLink.name);
            System.out.println("Seventh link Strawhat: " + seventhLink.name);
            System.out.println("Eigth link Strawhat: " + eigthLink.name);
            System.out.println("Ninth link Strawhat: " + ninthLink.name);
            System.out.println("Tenth link Strawhat: " + tenthLink.name);

            Node<StrawHats> nodeForLuffy = linkedList.head;
            System.out.println("Testing Size method. Anticipating 9 Strawhats after luffy joined: " + linkedList.size(nodeForLuffy));
        }   

        {
            LinkedList<ComputerParts> linkedList = new LinkedList<>();

            ComputerParts partOne = new ComputerParts("CPU");
            ComputerParts partTwo = new ComputerParts("GPU"); 
            ComputerParts partThree = new ComputerParts("RAM");
            ComputerParts partFour = new ComputerParts("Motherboard");
            ComputerParts partFive = new ComputerParts("SSD");
            ComputerParts partSix = new ComputerParts("Hard Drive");
            ComputerParts partSeven = new ComputerParts("Power Supply");
            ComputerParts partEight = new ComputerParts("Cooling Fan");
            ComputerParts partNine = new ComputerParts("Case");
            ComputerParts partTen = new ComputerParts("Optical Drive");

            linkedList.add(partOne);
            linkedList.add(partTwo);
            linkedList.add(partThree);
            linkedList.add(partFour);
            linkedList.add(partFive);
            linkedList.add(partSix);
            linkedList.add(partSeven);
            linkedList.add(partEight);
            linkedList.add(partNine);
            linkedList.add(partTen);

            ComputerParts firstPart = linkedList.get(0);
            ComputerParts secondPart = linkedList.get(1);
            ComputerParts thirdPart = linkedList.get(2);
            ComputerParts fourthPart = linkedList.get(3);
            ComputerParts fifthPart = linkedList.get(4);
            ComputerParts sixthPart = linkedList.get(5);
            ComputerParts seventhPart = linkedList.get(6);
            ComputerParts eigthPart = linkedList.get(7);
            ComputerParts ninthPart = linkedList.get(8);
            ComputerParts tenthPart = linkedList.get(9);

            System.out.println("First part: " + firstPart.part);
            System.out.println("Second part: " + secondPart.part);
            System.out.println("Third part: " + thirdPart.part);
            System.out.println("Fourth part: " + fourthPart.part);
            System.out.println("Fifth part: " + fifthPart.part);
            System.out.println("Sixth part: " + sixthPart.part);
            System.out.println("Seventh part: " + seventhPart.part);
            System.out.println("Eighth part: " + eigthPart.part);
            System.out.println("Ninth part: " + ninthPart.part);
            System.out.println("Tenth part: " + tenthPart.part);

            Node<ComputerParts> nodeForCpu = linkedList.head;
            System.out.println("Size after CPU: " + linkedList.size(nodeForCpu));
        }
    }
}
