
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] ar= {6,3,9,5,2,8};
      for(int i=0;i<ar.length;i++) {
    	  for(int j=1;j<ar.length-i;j++) {
    		  if(ar[j-1]>ar[j]) {
    			  int temp=ar[j];
    			  ar[j]=ar[j-1];
    			  ar[j-1]=temp;
    		  }
    	  }
      }
      for(int ele:ar)
    	  System.out.print(ele+" ");
	}

}
