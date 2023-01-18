package Day12_Java;

import java.util.StringTokenizer;

interface Phone {
	int BUTTONS = 20;
	void send();
	void receive();
}
interface Mobile extends Phone {	//인터페이스 상속
	void sendKakao();
	void receiveKakao();
}
interface MP3 {
	void play();
	void stop();
}
class PDA {
	public int cal( int x, int y) {
		return x + y;
	}
	
}
class Smart extends PDA implements Mobile,MP3 {	//extends가 먼저 사용되어야 함

	@Override
	public void send() {
		
	}

	@Override
	public void receive() {
		
	}


	@Override
	public void sendKakao() {
		
	}

	@Override
	public void receiveKakao() {
		
	}
	
	@Override
	public void play() {
		
	}
	
	@Override
	public void stop() {
		
	}
}
public class Day12_Java1_repeatDay11 {
	public static void main(String[] args) {
		Smart st = new Smart();
		st.send();
		st.sendKakao();
		st.receive();
		st.receiveKakao();
		st.play();
		st.stop();
		st.cal(10, 15);
		
		
		
		
	}
}
