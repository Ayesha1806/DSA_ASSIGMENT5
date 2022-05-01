package DSA_ASS_5;

public class sizeofdubblylinkelist {
    public class CreateDoublyLinkedList {
        class Node {
            String data;
            Node prev;
            Node next;

            public Node(String data) {
                this.data = data;
            }
        }

        Node head = null;
        Node tail = null;


        public void addNewNode(String data) {


            Node newNode = new Node(data);


            if (head == null) {

                head = newNode;
                tail = newNode;

                head.prev = null;

                tail.next = null;
            } else {
                tail.next = newNode;

                newNode.prev = tail;

                tail = newNode;

                tail.next = null;
            }
        }
    }}
