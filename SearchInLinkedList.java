package DSA_ASS_5;

public class SearchInLinkedList {
    static Node head;

    public static void main(String[] args) {
        AddElement(5);
        AddElement(8);
        AddElement(3);
        AddElement(1);
        AddElement(4);
        AddElement(2);
        display1();
        serachelement(3);
    }

    private static void serachelement(int target) {
        boolean flag=false;
        int i=1;
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            Node cur=head;
            while(cur!=null){

                if(cur.data==target){
                    flag=true;
                    break;
                }
                else{
                    cur=cur.next;
                    i++;
                }


            }

        }
        if(flag){
            System.out.println("elemnt is present in list "+i);
        }
        else{
            System.out.println("elemnt is not present in list");
        }

    }

    private static void display1() {
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            Node cur=head;
            while(cur!=null){
                System.out.print(cur.data+" ");
                cur=cur.next;
            }
            System.out.println();
        }
    }

    private static void AddElement(int data) {
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;

        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }
}
