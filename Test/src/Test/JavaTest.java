package Test;
// 6.
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Student implements Serializable {
	private String name;
	private String id;
	private int age;

	Student(String name, String id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
	void show() {
		System.out.println("이름 : " + name + ", 아이디 : " + id + ", 나이 : " + age);
	}
	
}
public class JavaTest {

	public static void main(String[] args) throws IOException {

		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("ob.dat"));

			Student s = new Student("jack", "123", 20);
			s.show();

			oos.writeObject(s); 

		} catch (Exception e) {
			oos.close();
		}
		
		ObjectInputStream ois = null;

		try {
			ois = new ObjectInputStream(new FileInputStream("ob.dat"));

			Student s = (Student) (ois.readObject());
			s.show();

		} catch (Exception e2) {

			ois.close();

		}
	}
}
// 5. 
//import java.awt.*;
//
//import javax.swing.*;
//
//public class JavaTest extends JFrame {
//	JavaTest() {
//		Container c = getContentPane();
//		setVisible(true);
//		
//		JButton [] bt = new JButton[9];
//		for (int i = 1; i <= 9; i++) {
//			bt[i] = new JButton("" + i);
//			c.add(bt[i]);
//		}
//		GridLayout 	lay = new GridLayout(3, 3);
//		c.setLayout(lay);
//	}
//
//	public static void main(String[] args) {
//		new JavaTest();
//
//	}
//}
//4.
//
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Scanner;
//import java.util.Set;
//
//public class JavaTest {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		HashMap<String, Double> map1 = new HashMap<String, Double>();
//
//		map1.put("김건용", 12.34);
//		map1.put("용건김", 56.78);
//		
//		String str = sc.next();
//		Set<String> keys = map1.keySet();
//		Iterator<String> it3 = keys.iterator();
//		
//		while(it3.hasNext()) {
//			String key = it3.next();
//			if(key.equals(str)) {
//				Double ID = map1.get(key);
//				System.out.println(key+"의 ID는 "+ ID +" 입니다");
//			}
//		}
//	}
//
//}

// 3.
//class Num {
//	int n,sum, max;
//	int[] arrl;
//
//	Num() {
//		n = 0;
//	}
//	Num(int n) {
//		this.n = n;
//	}
//	int getSum() {
//
//		return sum;
//	}
//
//	int getMax() {
//		return max;
//	}
//
//	int add(int a) {
//		sum += a;
//		if(max < a) {
//			max = a;
//		}
//		return sum;
//	}
//	int getSum(int q, int w) {
//		
//		return q+w;
//	}
//	
//	int getMax(int q, int w) {
//		return (q < w) ?  w : q;
//	}
//}
//
//public class JavaTest1 {
//
//	public static void main(String[] args) {
//
//		Num nb = new Num();
//		nb.add(7);
//		nb.add(-1);
//		nb.add(20);
//		nb.add(5); // 4개 숫자를 입력
//
//		System.out.println("Sum = " + nb.getSum()); // 4개 숫자의 합계
//		System.out.println("Max = " + nb.getMax()); // 4개 숫자 중 최대값
//		
//		Num nb2 = new Num(10);
//		
//		System.out.println("Sum = " + nb2.getSum(10,25)); // 4개 숫자의 합계
//		System.out.println("Max = " + nb2.getMax(15,15)); // 4개 숫자 중 최대값
//	}
//	
//}

// 2.
//import java.util.Scanner;
//
//class Circle {
//	private double r;
//
//	Circle(double r) {
//		this.r = r;
//	}
//
//	double area() {
//		return 3.14 * r * r;
//	}
//}
//
//public class JavaTest1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		double sum = 0;
//		Circle c[] = new Circle[5];
//		for (int i = 0; i < 5; i++) {
//			c[i] = new Circle(sc.nextDouble());
//			sum += c[i].area();
//		}
//		System.out.println(sum);
//	}
//}

// 1.
//
//import java.util.Scanner;
//
//public class JavaTest1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("두 정수를 입력");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		System.out.println("합은 " + (a + b));
//	}
//}
