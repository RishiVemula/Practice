
public class countingcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello to students121";
        
        countCharacterType(s);

	}

	public static void countCharacterType(String s) {
		// TODO Auto-generated method stub
		 int vowels = 0, consonants = 0, specialCharacters = 0, digits = 0;
		 for (int i = 0; i < s.length(); i++) {
             
	            char ch = s.charAt(i);
	            if ( (ch >= 'a' && ch <= 'z') || 
	                    (ch >= 'A' && ch <= 'Z') ) {
	          
	                    
	                    ch = Character.toLowerCase(ch);
	          
	                    if (ch == 'a' || ch == 'e' || ch == 'i' ||
	                        ch == 'o' || ch == 'u')
	                        vowels++;
	                    else
	                        consonants++;
	                    }
	                    else if (ch >= '0' && ch <= '9')
	                        digits++;
	                    else
	                        specialCharacters++;
		 }
		    System.out.println("Vowels: " + vowels);
	        System.out.println("Consonant: " + consonants);
	        System.out.println("Digit: " + digits);
	        System.out.println("Special Character: " + specialCharacters);
		      
		
	}

}
