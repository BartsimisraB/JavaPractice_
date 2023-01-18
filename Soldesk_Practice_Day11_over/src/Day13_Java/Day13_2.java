package Day13_Java;

import java.io.FileOutputStream;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

class Rec {
	int a, b;
	
	Rec(int a, int b) {
		this.a = a;
		this.b = b;
	}
}
public class Day13_2 {
	public static void main(String[] args)throws NotSerializableException,NotSerializableException, Exception {
		
		ObjectOutputStream os = null;
		os = new ObjectOutputStream(new FileOutputStream("obj.dat"));
		
		os.writeObject(new String("glgl"));
//		os.writeObject(new Rec(4,7));
		Rec r1 = new Rec(4, 7);
//		os.writeObject(new Rec(5,8));
		Rec r2 = new Rec(5, 8);
		os.writeObject(r1);
		os.writeObject(r2);
		
		os.close();
	}
}
