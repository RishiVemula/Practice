
public class ArrayDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=false;
		int[] ar= {1,2,3,2,1};
		System.out.println("duplicate elements:");
		for(int i=0;i<ar.length;i++) {
		for(int j=i+1;j<ar.length;j++) {
			if(ar[i]==ar[j]) {
				System.out.println(ar[i]);
				flag=true;
			}
		}
		}
		if(flag==false)
			System.out.println("not found");
		
		

	}

}
