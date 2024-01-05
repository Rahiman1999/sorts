public class heapSort
{
	public static void main(String[] args) {
		int A[] = {6,9,3,7,5,25,3,9,34,82,31};
		heapify(A,A.length-1);
		for(int i:A){
		    System.out.print(i+" ");  //82 34 25 9 31 3 3 6 7 5 9
		}
		heapSort(A,A.length-1);
		System.out.println();
		for(int i:A){
		    System.out.print(i+" ");  //3 3 5 6 7 9 9 25 31 34 82
		}
	}
	
	public static void heapify(int[] A,int size){
	    for(int i=size/2;i>=0;i--){
	        heap(A,i,size);
	    }
	}
	public static void heap(int[] A,int index,int size){
	    int left = 2*index+1;
	    int right = left+1;
	    int max = index;
	    if(left<=size&&A[left]>A[max]){
	        max = left;
	    }
	    if(right<=size&&A[right]>A[max]){
	        max = right;
	    }
	    if(max!=index){
	       swap(A,index,max);
	        heap(A,max,size);
	    }

	}
	
	public static void heapSort(int[] A, int size){
	    while(size>=0){
	       swap(A,size,0);
	       size--;

	        heapify(A,size);
	    }
	    
	}
	
	public static void swap(int[] A, int a, int b){
	    int t = A[a];
	    A[a] = A[b];
	    A[b]= t;
	}
}
