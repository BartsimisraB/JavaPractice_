package Day11_Java1;

interface Animal {
	public void bear();
}

interface Fish {
	public void swim();
}
class AB implements Animal, Fish{	//�������̽��� ���߻���� ���� 
	//Ŭ�������� �������̽��� ���� �� ���� ����� �������̽��� ��� �޼ҵ带 ������ �;���
	public void bear() {
		System.out.println("���´�.");
	}
	
	public void swim() {
		System.out.println("�����Ѵ�.");
	}
	
	
}
public class Day11_6_InterFace2 {
	public static void main(String[] args) {
		
		AB ab = new AB();
		ab.bear();
		ab.swim();
		
		
		
	}
}
