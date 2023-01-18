import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test4 {
	public static void main(String[] args) throws Exception {
		
		byte b [] = {1,2,3,4,5};
		
		FileOutputStream fo = new FileOutputStream("fi.txt");
		
		fo.write(b);
		fo.close();
		
		FileInputStream fi = new FileInputStream("fi.txt");
		
		byte[] a = fi.readAllBytes();
		
		for(byte arr : a) {
			System.out.println(arr);
		}
		fi.close();
	}
}
