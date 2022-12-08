
public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Pack my box with five dozen liquor jugs";
		s=s.replace(" ","");
		s=s.toUpperCase();
		if(isPangram(s))
			System.out.print("it is pangram");
		else
			System.out.print("it is not pangram");

	}

	public static boolean isPangram(String s) {
		// TODO Auto-generated method stub
         boolean flag=true;
		char[] ch=s.toCharArray();
		int[] ar=new int[26];
		for(int i=0;i<ch.length;i++) {
			int index=ch[i]-65;
			ar[index]++;
		}
		for(int i=0; i<ar.length;i++)
		{
			if(ar[i]==0) {
				flag= false;
				}
			}
		return flag;

}
}
