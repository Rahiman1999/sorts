public class BubbleSort
{
	public static void main(String[] args) {
		int A[] = {5,2,3,9,7,12,6,1};
		/*
		In bubble sort it picks bigger element and assign it to the end of the array.
		*/
		for(int i=0;i<A.length;i++){
		    for(int j=0;j<A.length-1-i;j++){  
		        if(A[j]>A[j+1]){
		            int t = A[j];
		            A[j] = A[j+1];
		            A[j+1]=t;
		        }
		    }
		}
		
		for(int i:A){
		    System.out.print(i+" ");
		}
	}
}