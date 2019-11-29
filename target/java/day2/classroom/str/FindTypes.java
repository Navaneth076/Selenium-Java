package day2.classroom.str;

public class FindTypes {


	public static void main(String[] args) {
		// Here is the input
		String test = "$$ Welcome to 2nd Automation Class $$ ";

		// Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0;

		char[] test1 = test.toCharArray();
		System.out.println(test1[4]);
		for(int i=0; i<=test1.length-1; i++ ) {
			if (Character.isLetter(test1[i])) {
				letter++;
				
			} 
			else if(Character.isDigit(test1[i])) {
				num++;
			}
			else if(Character.isSpaceChar(test1[i])){
				space++;
			}
			else
			{
				specialChar++;
			}
				
			
			
				
				
		}
		// Build the logic to find the count of each
		/* Pseudo Code:
			a) Convert the String to character array
			b) Traverse through each character (using loop)
			c) Find if the given character is what type using (if)
					i)  Character.isLetter
					ii) Character.isDigit
					iii)Character.isSpaceChar
					iv) else -> consider as special character
		*/
		

		// Print the count here
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
	}

}
