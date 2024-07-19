package datastructures.singlylinkedlist;

public class SinglyLinkedList {

    private static ListNode head;

    static int count = 0;

    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

        public String toString() {
            return data + " -->" + next;
        }
    }

    public static void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }


    public static int size() {
        count = 0;
        return findSize(head);
    }

    public static int sizeWithoutRecursion() {
        count = 0;
        ListNode currentNode = head;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }

    public static int findSize(ListNode current) {
        if (current == null) {
            return count;
        }
        count++;
        return findSize(current.next);
    }

    public static void insertFirst(ListNode newNextNode) {
        newNextNode.next = head;
        head = newNextNode;
    }

    public static void insertLast(ListNode newNode) {
        if (head == null) {
            head = newNode;
            return;
        }

        ListNode currentNode = head;
        while (null != currentNode.next) {
            currentNode = currentNode.next;//current node as last tail node at the end of the iteration
        }
        currentNode.next = newNode;
    }

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        head = new ListNode(10);

        ListNode sn2 = new ListNode(20);
        ListNode sn3 = new ListNode(30);
        ListNode sn4 = new ListNode(40);
        ListNode sn5 = new ListNode(50);
        ListNode sn6 = new ListNode(60);
        head.next = sn2;
        sn2.next = sn3;
        sn3.next = sn4;
        sn4.next = sn5;
        sn5.next = sn6;
        System.out.println(list);
        //display();
        System.out.println("size using recursion ====>" + size());

        System.out.println("sizeWithoutRecursion ===>" + sizeWithoutRecursion());

        insertFirst(new ListNode(9));
        insertFirst(new ListNode(8));
        insertFirst(new ListNode(7));
        //display();
        insertLast(new ListNode(100));
        System.out.println("after insert last 100");
        //display();

        System.out.println("head ===>" + head);
        System.out.println("head.next ===>" + head.next);

        addNodeByPosition(25, 5);

        System.out.println("Before deleting first node");
        display();
        deleteFirstNode();
        System.out.println("After deleting first node");
        display();

        System.out.println("Before deleting node at given specific position");
        display();

        System.out.println("After deleting node at given specific position");
        deleteNodeByGivenPosition(2);
        display();

        //swap the node by giving the positions
        System.out.println("Before swapping positions");
        display();

        swapNodesByPositions(2, 7);

        System.out.println("After swapping positions");
        display();

        //Reverse the elements in given linked list

        System.out.println("Before delete last node of index in singled linked list");

        display();
        ListNode lastNode = deleteLastNodeInSingledLinkedList();

        System.out.println("After delete last node of index in singled linked list" + lastNode);
        display();


        System.out.println("search given index in singled linked and return last index");

        searchGivenDataInSingluredLinkedList(60);

        System.out.println("Before reverse a given single linked");

        display();

        reverseSingleLinkedList();

        System.out.println("After reverse a single linked list");

        display();

        System.out.println("Middle element in linked list " + getMiddleNodeFromSingleLinkedList());

//        System.out.println("Before reverse a given single linked");
//
//        display();
//
//        reverseSingleLinkedListBySaiApproach();
//
//        System.out.println("After reverse a single linked list");
//
//        display();

        System.out.println("getMiddleNodeFromSingleLinkedListByDineshSirApproach===> " +
                getMiddleNodeFromSingleLinkedListByDineshSirApproach());

    }

    private static ListNode getMiddleNodeFromSingleLinkedListByDineshSirApproach() {

        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while (fastPtr !=null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;

    }

    private static Integer getMiddleNodeFromSingleLinkedList() {

        int size = size();
        ListNode middleNode = head;

//        for (int i = 1; i <= size / 2 + 1; i++) {
//            middleNode = middleNode.next;
//        }
        int count = 1;
        while (count<size/2+1) {
            middleNode = middleNode.next;
            count++;
        }
        return middleNode.data;
    }

    private static void reverseSingleLinkedListBySaiApproach() {
        ListNode current = head;
        ListNode previous = head;

        while(current.next !=null ) {
            current = current.next;
            current = previous;
            previous = current;
        }
        head = previous;
    }

    private static ListNode searchGivenDataInSingluredLinkedList(int searchKey) {

        if (head == null) {
            System.out.println("head is null");
            return null;
        }
        if (head.next == null) {
            if (head.data == searchKey) {
                return head;
            } else {
                System.out.println("Inside head if, given element not found " + searchKey);
                return null;
            }
        }

        ListNode currentNode = head;

        while (currentNode != null) {
            if (currentNode.data == searchKey) {
                System.out.println("Given element found " + searchKey);
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        System.out.println("Given element not found " + searchKey);
        return null;
    }

    private static ListNode deleteLastNodeInSingledLinkedList() {

        if (head == null || head.next == null) {
            return null;
        }
        ListNode currentNode = head;
        ListNode lastPreviousNode = head;
        while (currentNode.next != null) {
            lastPreviousNode = currentNode;
            currentNode = currentNode.next;
        }
        lastPreviousNode.next = null;

        return currentNode;
    }

    public static void addNodeByPosition(Integer data, Integer position) {
        ListNode newNode = new ListNode(data);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode previousNode = head;
            Integer count = 1;
            while (count < position - 1) {
                previousNode = previousNode.next;
                count++;
            }

            ListNode currentNode = previousNode.next;
            previousNode.next = newNode;
            newNode.next = currentNode;
        }

    }

    public static ListNode deleteFirstNode() {

        if (head == null) {
            return null;
        }

        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public static ListNode deleteNodeByGivenPosition(Integer position) {

        if (head == null) {
            return null;
        }

        if (position == 1 && head.next == null) {
            ListNode temp = head;
            head = null;
            return temp;
        }

        ListNode previousNode = head;
        Integer count = 1;

        while (count < position - 1) {
            previousNode = previousNode.next;
            count++;
        }

        ListNode temp = previousNode.next;
        previousNode.next = temp.next;
        temp.next = null;
        return temp;
    }


    public static void swapNodesByPositions(Integer position1, Integer position2) {

        ListNode nodeByPosition1 = getNodeByPosition(position1);
        ListNode nodeByPosition2 = getNodeByPosition(position2);

        Integer temp = nodeByPosition1.data;
        nodeByPosition1.data = nodeByPosition2.data;
        nodeByPosition2.data = temp;

    }

    private static ListNode getNodeByPosition(Integer position1) {
        int count = 1;
        ListNode positionNode = head;
        while (count < position1) {
            positionNode = positionNode.next;
            count++;
        }
        return positionNode;
    }

    private static void reverseSingleLinkedList() {
        if(head == null) {
            return;
        }

        ListNode currentNode = head;
        ListNode previous = null;
        ListNode next = null;

        while (currentNode != null) {
            next = currentNode.next;
            currentNode.next = previous;
            previous = currentNode;
            currentNode = next;
        }

        head = previous;
    }
}
