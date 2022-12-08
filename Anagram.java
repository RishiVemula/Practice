
public class Anagram {
     static final int CHAR=256;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Listen"; 
        String s2 = "Silent"; 
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if (isAnagram(s1, s2)) 
            System.out.println("The two strings are"
                               + " anagram of each other"); 
        else
            System.out.println("The two strings are not"
                               + " anagram of each other"); 

	}

	public static boolean isAnagram(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1.length()!=s2.length())
		  return false;
		int count[]=new int[CHAR];
		for(int i=0;i<s1.length();i++) {
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
			}
		for(int i=0;i<CHAR;i++) {
		if(count[i]!=0)
		return false;
		}
		return true;
	}

}
