package Day11_Java1;
class Tv1{
	public void on() {
		System.out.println("Ƽ�� ��");
	}
}
interface Computer {
	public void m();	//�߻� �޼ҵ�
}

class Com {
	public void m()	{
		System.out.println("��");
	}
}

class Ipad extends Tv1 implements Computer {
	Com c = new Com();

	@Override
	public void m() {
		c.m();
	}
	public void ip() {
		m();
		on();
	}
}
public class Day11_7 {

	public static void main(String[] args) {

		Ipad i = new Ipad();
		
		//Tv1 t = i;	//up
		//Computer c = i;	//up
		i.ip();
		
	}
}