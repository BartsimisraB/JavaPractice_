package Day13_Java;

public class Main4 {
	public static void main(String[] args) {
//		4. 실수 9.5를 객체화(박싱) 시켜라.
//

		Double dNum = new Double(9.5);
//		4.1) 객체화 시킨 9.5를 문자열로 변경해라.
//

		String dNum1 = dNum.toString();
//		4.2) 문자열로 변경한 9.5를 기본형값으로 언박싱해라.
//
		Double dNum2 = Double.valueOf(dNum1);
	}
}
