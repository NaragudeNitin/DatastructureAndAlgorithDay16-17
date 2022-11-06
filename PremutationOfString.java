package dsaPackage;

import java.util.Scanner;

public class PremutationOfString {
	public static String swapStringCharacter(String str, int first, int next) {
		char[] str1 = str.toCharArray();
		char ch;
		ch = str1[first];
		str1[first] = str1[next];
		str1[next] = ch;
		return String.valueOf(str1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.next();
		int len = str.length();
		System.out.println("permutations of the String are :");
		permutation(str, 0, len);

		sc.close();
	}

	public static void permutation(String str, int start, int len) {

		if (start == len - 1)
			System.out.println(str);
		else {
			for (int i = start; i < len; i++) {
				str = swapStringCharacter(str, start, i);

				permutation(str, start + 1, len);
				str = swapStringCharacter(str, start, i);

			}
		}
	}
}
