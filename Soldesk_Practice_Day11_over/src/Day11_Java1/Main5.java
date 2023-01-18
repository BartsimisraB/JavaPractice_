package Day11_Java1;

import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {

//		두 사람이 가위바위보를 한다. 가위,바위,보 중 하나를 문자열로 
//		입력받아 누가 이겼는지 판단하는 프로그램을작성해라.(중첩 if문 사용해야함, 문자열 비교) 
//		실행결과) 영수 : 가위
//	 			철수 : 보
//				철수가 이겼다.

		Scanner sc = new Scanner(System.in);
		System.out.print("영수 : ");
		String str1 = sc.nextLine();
		System.out.print("철수 : ");
		String str2 = sc.nextLine();

		if (str1.equals("가위")) {
			if (str2.equals("바위")) {
				System.out.println("철수가 이겼다.");
			} else if (str2.equals("보")) {
				System.out.println("영수가 이겼다.");
			} else {
				System.out.println("비겼다.");
			}
		} else if (str1.equals("바위")) {
			if (str2.equals("보")) {
				System.out.println("철수가 이겼다.");
			} else if (str2.equals("가위")) {
				System.out.println("영수가 이겼다.");
			} else {
				System.out.println("비겼다.");
			}
		} else if (str1.equals("보")) {
			if (str2.equals("가위")) {
				System.out.println("철수가 이겼다.");
			} else if (str2.equals("바위")) {
				System.out.println("영수가 이겼다.");
			} else {
				System.out.println("비겼다.");
			}
		}

	}

}
