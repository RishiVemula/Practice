
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2, 1, 4, 3};
	    selectionSort(a, 4);
	    
	    for(int i = 0; i < 4; i++){
	        System.out.print(a[i] + " ");

	}
	    

}
      static void selectionSort(int[] a, int n) {
		// TODO Auto-generated method stub
    	  for(int i=0;i<n;i++) {
    		  int min_index=i;
    		  for(int j=i+1;j<n;j++) {
    			  if(a[j]<a[min_index])
    				  min_index=j;
    		  }
    		  int temp=a[i];
    		  a[i]=a[min_index];
    		  a[min_index]=temp;
    	  }
		
	}
}
