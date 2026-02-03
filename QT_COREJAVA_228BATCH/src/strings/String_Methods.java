package strings;

public class String_Methods {

	public static void main(String[] args) {
			//1.String Equals and EqualsIgnoreCase
		
		/* String str1 = "Hello, world!";
		String str2 = "Hello, World!";
		
		String str3=new String("Hello, world!");
		String str4=new String("Hello, World!");
		
		System.out.println(str1==str2); // true
		System.out.println(str3==str4); // false
		
		System.out.println(str1.equals(str2)); // true
		System.out.println(str3.equals(str4)); // false
		
		System.out.println(str1.equalsIgnoreCase(str2)); // true
		System.out.println(str3.equalsIgnoreCase(str4)); // false
		*/
		
		//String Contains
		/*String str1 = "Hello, welcome to Java programming.";
		String str2 = "Java";
		System.out.println(str1.contains(str2)); // true */
		
		//String length
		/*String str1 = "Hello, world!";
		int strlen=str1.length();
		System.out.println("Length of str1: " + strlen); // 13
		//System.out.println("Length of str1: " + str1.length()); // 13
		*/
		//String UpperCase and LowerCase
		/*String str1 = "Hello, World!";
		String upperStr = str1.toUpperCase();
		String lowerStr = str1.toLowerCase();
		System.out.println("Uppercase: " + upperStr); // "HELLO, WORLD!"
		System.out.println("Lowercase: " + lowerStr); // "hello, world!"
		*/
		
		//String Trim
		/*String str1 = "   Hello, World!   ";
		System.out.println("Original String: '" + str1 + "'");
		System.out.println("Trimmed String: '" + str1.trim() + "'");
		*/
		//String Replace
		
		/*String str1 = "Hello, World!";
		
		System.out.println("Original String: " + str1);
		//String replacedStr = str1.replace('o', 'A');
		String replacedStr = str1.replace("Hello, World!", "Hi, Universe!");
		
		System.out.println("Replaced String: " + replacedStr);
		*/
		
		//String Concat
	/*	String str1 = "Hello, ";
		String str2 = "World!";
		String concatenatedStr = str1.concat(str2);
		System.out.println("Original String 1: " + str1);
		System.out.println("Original String 2: " + str2);
		System.out.println("Concatenated String: " + concatenatedStr);
		*/
		
		//String CopyValueOf and ValueOf
		
		char[] charArray = {'K', 'a', 'v', 'a'};
		//System.out.println(charArray.length); // "Java"
		String str3="";
		System.out.println("String str3: " + str3.copyValueOf(charArray)); // "Java"
		
		
		//String str1="Java";
		//String str2="";
		//System.out.println("String str1: " + str2.valueOf(str1)); // "Java"
		
		
	}

}
