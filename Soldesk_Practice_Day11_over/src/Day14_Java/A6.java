package Day14_Java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String a, b;
	int c, d;
	
	Person(String a, String b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	void show() {
		System.out.println(a + " " + b + " " + c + " " + d);
	}
	
	
}
public class A6 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		

		Person p=new Person("Jack", "computer", 20, 123); 
		System.out.println("파일 생성 시작");
		p.show();	
		
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obji.dat"));	// 파일 생성해서 저장하기
		oos.writeObject(p);
		oos.close();

		System.out.println("파일 생성 완료!!");
		System.out.println();
		
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obji.dat"));	//파일 읽어와서 출력하기
		Person pRead = (Person)ois.readObject();
		ois.close();
		pRead.show();
		System.out.println("파일 읽기 완료");
//		Boolean b = Boolean.parseBoolean("False");
//		Double d = Double.parseDouble("36.5");
//		Integer s = Integer.valueOf("35");
//		
//		Boolean b2 = false;
//		b.toString();
//		String b1 = Boolean.toString(b2);
//		
//		String a = "36.5";
//		Double d2 = Double.parseDouble(a);
//		
//		String a2 = "35";
//		Integer i = Integer.valueOf(a2);
	}

	}
