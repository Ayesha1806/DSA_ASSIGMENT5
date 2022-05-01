package DSA_ASS_5;

public class Intersationoflinkeddlist {
    public <ListNode> ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null)//return empty
            return null;

        int lengthA=0;
        int lengthB=0;

        ListNode a=headA;
        ListNode b=headB;
        while(a!=null)//The length of A
        {
            lengthA++;
            a=a.next;
        }
        while(b!=null)//The length of B
        {
            lengthB++;
            b=b.next;
        }
        a=headA;
        b=headB;

        int minus=lengthA-lengthB;//length difference
        while(minus!=0)//Let the long linked list take the difference in length first
        {
            if(minus>0)
            {
                a=a.next;
                minus--;
            }
            else
            {
                b=b.next;
                minus++;
            }
        }
        while(a!=null&&b!=null)//To judge whether they are equal
        {
            if(a==b)//equal return
                return a;
            else//Continue to judge if it is not equal
            {
                a=a.next;
                b=b.next;
            }
        }
        return null;//If there is no equal, then return null
    }
}
