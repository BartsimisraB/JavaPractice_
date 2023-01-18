import java.util.Scanner;

public class String_10809 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String [] str = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
				"m", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

		for (int i = 0; i < a.length(); i++) {

			for (int j = i; j < str.length; j++) {

				if (str[j].equals(Character.toString(a.charAt(i)))) {
					str[j] = "" + i;
					break;
				}
				else if(!str[j].equals(Character.toString(a.charAt(i)))) {
					str[j] = "" + -1;
					
				}
				else if(str[j] !="" + -1) {
					continue;
					
				}
			}
		}
		for(String b : str) {
			System.out.print(b + " ");
		}
	}
}