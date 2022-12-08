
public class MaxOccuringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "rama sita";
        System.out.println("Max occurring character is "
                           + getMaxOccurringChar(str));

	}
	static char getMaxOccurringChar(String str)
    {
  
        int count[] = new int[256];
        int len = str.length();
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;
        int max = -1; 
        char result = ' '; 
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
 
        return result;
    }

}
