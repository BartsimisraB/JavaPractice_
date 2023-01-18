package Day14_Java;
class Th implements Runnable {
	String name;
	
	Th(String str) {
		name = str;
	}
	
	public void run() {
		System.out.println(name);
	}
}
class Timer extends Thread {
	
	public void run() {
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch(Exception e) {
				
			}
		}
	}
}
public class A3_ {
	public static void main(String[] args) {
		
		   Th t1=new Th("¾²·¹µå 1");
		   Thread th=new Thread(t1);
		   th.start(); 
		   
		   Timer t = new Timer();
		   t.start(); 
	}
}
