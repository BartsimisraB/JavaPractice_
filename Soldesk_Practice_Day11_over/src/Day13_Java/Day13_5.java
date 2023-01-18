package Day13_Java;

import java.util.ArrayList;

public class Day13_5 {
	public static void main(String[] args) {
		// List Interface => <>
		ArrayList<String> a = new ArrayList<String>();

		a.add("종진");
		a.add("신요");
		a.add("준형");

		for (int i = 0; i < a.size(); i++) {
			String b = a.get(i);
			System.out.println(b);
		}
	}
}
