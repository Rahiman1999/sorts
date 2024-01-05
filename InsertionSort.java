public class InsertionSort
{
	public static void main(String[] args) {
		int A[] = {5,2,3,9,7,12,6,1};
		// Time complexity = O(N^2) in worst case 
		//in best case time comp = O(N)
		  // the insertion sort start from index 1 and it compare to previous element which is indes-1 not next element and it will place it correct position.  
		for(int i=1;i<A.length;i++){  //inserttion sort always start with i=1
		    int value = A[i];
		    int index = i;
		    while(index>0&&A[index-1]>value){
		        A[index] = A[index-1];  //if index-1 is greater than current index then index value should be index-1 value
		        index--;  //it will keed decreasing till index value greater than index-1 value
		    }
		    A[index]=value;  //finlly it place the value to it's current position.
		}
		
		for(int i:A){
		    System.out.print(i+" ");
		}
	}
}