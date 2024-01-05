public class SelectionSort
{
	public static void main(String[] args) {
		int A[] = {5,2,3,9,7,12,6,1};
		//Time complexity = O(N^2) for both best and worst case :
	/* it is selection sort it will pick first element and compare with all next element it won't compare previos element
	   which is index -1 once found smallest element compared to current element it will replace until the correct value for 
	   current position.
	*/
		for(int i=0;i<A.length;i++){   // in selection sort it will start with i=0 to i <A.length
		    for(int j=i+1;j<A.length;j++){ //In selection sort the j start with i+1 to j<A.length
		        if(A[i]>A[j]){     // if A[i] > A[j] then it will swap selection sort looks for small element to replace current index
		            int t = A[i];
		            A[i]=A[j];
		            A[j] = t;
		        }
		    }
		}
		for(int i:A){
		    System.out.print(i+" ");
		}
	}
}