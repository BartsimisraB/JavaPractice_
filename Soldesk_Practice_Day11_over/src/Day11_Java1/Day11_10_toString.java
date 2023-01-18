package Day11_Java1;

import java.util.Scanner;

class Profile {
	String name, id;

	Profile(String n, String i) {
		name = n;
		id = i;
	}

	public String toString(String n, String i) {
		return n + " " + i;
	}
}

public class Day11_10_toString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Profile pf[] = new Profile[2];

		for (int i = 0; i < pf.length; i++) {
			String name = sc.nextLine();
			String id = sc.nextLine();
			pf[i] = new Profile(name, id);
		}
		
		for (Profile profile : pf) {
			System.out.println(profile.name + " " + profile.id);
		}
	}
}