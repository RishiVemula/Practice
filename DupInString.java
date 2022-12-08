import java.util.*;

public class DupInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java Language is best";
		char str[]=s.toCharArray();
		int len=str.length;
		removeDuplicate(str,len);

	}

	public static void removeDuplicate(char[] str, int n) {
		// TODO Auto-generated method stub
		int index=0;
		int i=0;
		for( i=0;i<n;i++) {
			int j=0;
			for(j=0;j<i;j++) {
				if(str[i]==str[j]) 
					break;
			}
			if(j==i)
				str[index++]=str[i];
		}
		System.out.println(String.valueOf(Arrays.copyOf(str, index)));
		
	}

}
