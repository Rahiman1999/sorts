public class Solution {
    public ListNode sortList(ListNode A) {
        ListNode ans=mergeSort(A);
        return ans;
    }
    public static ListNode mergeSort(ListNode A){
        if(A==null||A.next==null) return A;
        ListNode intersection = center(A);
        ListNode h2 = intersection.next;
        intersection.next=null;
        A=mergeSort(A);
        h2=mergeSort(h2);
        return merge(A,h2);
    }

    public static ListNode center(ListNode A){
        ListNode fast = A;
        ListNode slow = A;
        while(fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    public static ListNode merge(ListNode A,ListNode B){
        ListNode merge = null;
        ListNode h3=null;
        if(A.val<B.val){
           h3=A;merge=A;A=A.next;
        }else{
            h3=B;merge=B;B=B.next;
        }
        ListNode temp = merge;
        while(A!=null&&B!=null){
            if(A.val<B.val){
                temp.next=A;
                A=A.next;
                temp=temp.next;
            }else{
                temp.next=B;
                B=B.next;
                temp=temp.next;
            }
        }
        if(A!=null){
            temp.next=A;
        }
        if(B!=null){
            temp.next=B;
        }
        return merge;
    }

}
