import java.util.*;

public class UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="gone";
		if(isUnique(s))
			System.out.print("unique elements");
		else
			System.out.print("not unique");

	}

	public static boolean isUnique(String s) {
		// TODO Auto-generated method stub
		char[] c=s.toCharArray();
		Arrays.sort(c);
		for(int i=0;i<c.length-1;i++) {
			if(c[i]==c[i+1])
				return false;
		}
		return true;
	}

}
