public class RedixSort
{
	public static void main(String[] args) {
		int arr[]= {170,79,608,721,9,99,199,10,1235,8};
		radixSort(arr);
		for(int i:arr){
	        System.out.print(i+" ");
	    }
	}
	
	public static void radixSort(int[] arr){
	    int Max=0;
	    for(int i=0;i<arr.length;i++){
	        Max=Math.max(Max,arr[i]);
	    }
	    int exp=1;
	    while(Max>0){
	        Max/=10;
	        countSort(arr,exp);
	        exp*=10;
	       // System.out.println(exp);
	    }
	    
	}
	public static void countSort(int[] arr,int exp){
	    int n=arr.length;
	    int freq[] = new int[10];
	    for(int i=0;i<n;i++){
	        freq[(arr[i] / exp) % 10]++;
	    }
	     
	    
	    for(int i=1;i<freq.length;i++){
	       freq[i]=freq[i-1]+freq[i]; 
	    }
	    int ans[] = new int[n];
	    for(int i=n-1;i>=0;i--){
	        int pos = freq[(arr[i] / exp) % 10];
	        ans[pos-1]=arr[i];
	        freq[(arr[i] / exp) % 10]--;
	    }
	    
	    for(int i=0;i<ans.length;i++){
	        arr[i]=ans[i];
	    }
	    for(int i:arr){
	        System.out.print(i+" ");
	    }
	    System.out.println();
	   
	}
}