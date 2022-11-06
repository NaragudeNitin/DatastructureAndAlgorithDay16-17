package dsaPackage;

import java.util.Arrays;

public class AnagramDetectionUsingString {
	public static void main(String[] args) {

		String str1 = "earth";
		String str2 = "heart";
		
		/*if we have letters with different cases we can go like this
		 *str1 = str1.toLowerCase();
		 *str2 = str2.toLowerCase();
		 */

		if (str1.length() == str2.length()) {

			// strings to char Array conversion

			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();

			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			// if the sorted arrays are same then the string Anagram
			boolean result = Arrays.equals(charArray1, charArray2);
			if (result)
				System.out.println(str1 + " and " + str2 + " are anagram");
			else
				System.out.println(str1 + " and " + str2 + " are not anagram");
		}
	}

}

