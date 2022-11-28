
public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[]{10,5,30,15,7};
		int l=0,h=4;
		mergeSort(a,l,h);
		for(int e:a)
			System.out.print(e+" ");
		

	}
	static void merge(int a[],int l,int m,int h) {
		int n1=m-l+1, n2=h-m;
		int left[]=new int[n1];
		int	right[]=new int[n2];
		for(int i=0;i<n1;i++)
            left[i]=a[i+l];
        for(int j=0;j<n2;j++)
            right[j]=a[m+1+j];
        int k=l,i=0,j=0;
        while(i<n1 && j<n2) {
        	if(left[i]<=right[j])
        		a[k++]=left[i++];
        	else
        		a[k++]=right[j++];
        }
        while(i<n1)
        	a[k++]=left[i++];
        while(j<n2)
        	a[k++]=right[j++];	
	}
	static void mergeSort(int a[],int l,int h) {
		if(h>l) {
			int mid=(l+h)/2;
			mergeSort(a,l,mid);
			mergeSort(a,mid+1,h);
			merge(a,l,mid,h);
			
		}
	}

}
