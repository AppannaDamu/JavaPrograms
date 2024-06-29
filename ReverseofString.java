package sdet_javaPrograms;

public class ReverseofString {

	public static void main(String[] args) {
		// Way1
		
		String str = "abcd";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);

		}
		System.out.println(rev);
		
		//Way2
		
		String name="damu", nstr = "";
		char ch;
		
		for(int i=0; i<name.length(); i++)
		{
		 	ch=name.charAt(i);
		 	nstr = ch+nstr; //adds each character in front of the existing string
		}
		System.out.println(nstr);

	}

}
