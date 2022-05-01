package DSA_ASS_5;

public class RemoveDuplicatesFromstack {
    import java.util.Stack;

    public class deleteDuplicateElement {



        public static void main(String[] args) {

            int []a= {10,10,20,56};
            int size=a.length;
            findduplicate(a,size);
            System.out.println(a);

        }
        private static void findduplicate(int[] a, int size) {
            Stack<Integer> st = new Stack();

            for(int i=0;i<=size;i++) {
                if(a[i]==a[i+1]) {
                    st.pop();

                }



}
