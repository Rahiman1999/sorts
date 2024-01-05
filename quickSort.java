public class quickSort
{
	public static void main(String[] args) {
		int A[] = {25,15,7,64,24,35,12,30};
		quickSort(A,0,A.length-1);
		for(int i:A){
		    System.out.print(i+" ");
		}
	}
	public static void quickSort(int A[],int start,int end){
	    if(start<end){
	        int pIndex = partition(A,start,end); //you will get index number by running the partition funtion it is PIndex
	       // for(int i:A){
	       //     System.out.print(i+" ");
	       // }
	       // System.out.println();
	        quickSort(A,start,pIndex-1); // once the pIndex got you have to call the funtion of quickSort the end value should be pIndex-1
	  
	        quickSort(A,pIndex+1,end); //once the pIndex got you have to call the funtion of quickSort the start value should be pIndex+1
	  
	    }
	}
	/*
	In quicksort you have to take pivot element it can be anything I have choosen end one of array and need to take PI -->partition Index
	you have to compare pivot element in array by running loop of start and end
	if pivot element is greaterthan current i- index value you have to swap element with A[i] and A[pi] after this increase PI++ value
	if pivot element is not greaterthan current i- index value it won't swap anything in arrray. pi - value is same 
	once the loop has completed you need to swap pivot and pi in A - array
	finally return PI value;
	*/
	public static int partition(int A[],int start,int end){
	    int pivot= end;
	    int PI = start;
	    for(int i=start;i<end;i++){
	        if(A[pivot]>A[i]){
	            int t = A[i];
	            A[i] = A[PI];
	            A[PI] = t;
	            PI++;
	        }
	    }
	    int t=A[PI];
	    A[PI] = A[pivot];
	    A[pivot] = t;
	    return PI;
	}
}