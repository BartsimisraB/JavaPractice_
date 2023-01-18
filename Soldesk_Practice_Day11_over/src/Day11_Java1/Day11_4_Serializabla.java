package Day11_Java1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Stu implements Serializable { // Source > Generater setter,getter ��� ����
	// Stu Ŭ������ ��ü ������ ����ȭ �ϰڴ�.
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
		// ��ü �����ϱ�
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("ob.dat"));
			
			Stu s = new Stu();
			s.setName("�ſ�");
			s.setId("123");
			s.setAge(22);
			
			oos.writeObject(s); // ��ü s�� �аڴ�.
			
			
			
		} catch (Exception e) {
			oos.close();
		}
		// ��ü�� ���� �ٽ� �о���̱�
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
