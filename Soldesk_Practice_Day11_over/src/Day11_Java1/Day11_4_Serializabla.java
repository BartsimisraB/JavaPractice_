package Day11_Java1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Stu implements Serializable { // Source > Generater setter,getter 모두 선택
	// Stu 클래스의 객체 내용을 직렬화 하겠다.
	private String name;
	private String id;
	transient private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class Day11_4_Serializabla {
	public static void main(String[] args) throws IOException {
		// 객체 저장하기
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("ob.dat"));
			
			Stu s = new Stu();
			s.setName("신요");
			s.setId("123");
			s.setAge(22);
			
			oos.writeObject(s); // 객체 s를 읽겠다.
			
			
			
		} catch (Exception e) {
			oos.close();
		}
		// 객체로 부터 다시 읽어들이기
		ObjectInputStream ois =null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("ob.dat"));
			
			Stu s =(Stu)(ois.readObject());
			System.out.println(s.getName());
			System.out.println(s.getId());
			System.out.println(s.getAge());
			
		} catch (Exception e2) {
			
			ois.close();
			
		}
	}
}
