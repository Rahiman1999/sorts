public class mergeSort
{
	public static void main(String[] args) {
		int A[] = {5,20,45,30,25,10,28,40};
		
		MergeSort(A,0,A.length-1);
		for(int i:A){
		    System.out.print(i+" ");
		}
	}
	
     public static void MergeSort(int A[],int start,int end){
         if(start<end){
             int mid = (start+end)/2;
             MergeSort(A,start,mid);
             MergeSort(A,mid+1,end);
             merge(A,start,end,mid);
         }
     }
     public static void merge(int A[],int start,int end,int mid){
         int temp[]=new int[end-start+1];
         int i=start;
         int j=mid+1;
        //  System.out.print(i+" "+j);
        //  System.out.println();
         int k=0;
         while(i<=mid&&j<=end){
             if(A[i]<A[j]){
             temp[k]=A[i];
             i++;
             k++;
         }else{
             temp[k]=A[j];
             j++;
             k++;
         }
         }
         while(i<=mid){
             temp[k]=A[i];
             i++;
             k++;
         }
         while(j<=end){
             temp[k]=A[j];
             j++;
             k++;
         }
         
         k=0;
         for(int l=start;l<=end;l++){
             A[l]=temp[k++];
         }
         
     }
}
