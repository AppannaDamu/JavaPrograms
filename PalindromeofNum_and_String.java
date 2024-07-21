package sdet_javaPrograms;

public class PalindromeofNum_and_String {

	public static void main(String[] args) {

		// check given number is Palindrome or not
		int num = 1221;
		int givenNum = num;
		int rem, revNum = 0;

		while (num > 0) {
			rem = num % 10;
			revNum = (revNum * 10) + rem;
			num = num / 10;
		}
		if (givenNum == revNum) {
			System.out.println(givenNum + " number is Palindrome");

		} else {
			System.out.println(givenNum + " number is NOT Palindrome");
		}

		// check given string is Palindrome or not
		String str = "radar";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);

		}
		if(str.equals(rev))
		{
			
			System.out.println(str + " string is Palindrome");

		} else {
			System.out.println(str + " string is NOT Palindrome");
		}

	}

}
