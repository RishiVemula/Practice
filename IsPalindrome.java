
public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="2552";
		//s=s.toLowerCase();
		boolean b=isPalindrome(s);
		System.out.print(b);

	}

	public static boolean isPalindrome(String s) {
		// TODO Auto-generated method stub
		String rev="";
		boolean ans=false;
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
		}
		if(s.equals(rev)) {
			ans= true;
			}
		
		return ans;
	}

}
