package Day13_Java;

import java.util.ArrayList;

class Profile {
	String str;
	int num;

	Profile(String str, int num) {
		this.str = str;
		this.num = num;
	}

	public String toString() {
		return str + " " + num;
	}
}

public class Day13_6 {
	public static void main(String[] args) {
		ArrayList<Profile> a = new ArrayList<Profile>();

		a.add(new Profile("aa", 12));
		a.add(new Profile("bb", 17));
		a.add(new Profile("cc", 15));
		a.remove(1);
		for (int i = 0; i < a.size(); i++) {
			Profile p = a.get(i);
			System.out.println(p.num + " " + p.str);
		}
		
		for (Profile profile : a) {
			System.out.println(profile);
		}
	}
}
