
public class Printduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="beautiful beach";
		char[] c=s.toCharArray();
		int l=c.length;
		printDuplicates(c,l);

	}

	public static void printDuplicates(char[] c, int l) {
		// TODO Auto-generated method stub
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				if(c[i]==c[j]) {
					System.out.print(c[j]+ " ");
					break;
				}
				
			}
		}
		
	}

}
