package Day13_Java;

import java.util.Scanner;

public class Main9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			int rand =(int)(Math.random()*99) + 1;
			arr[i] = rand;
		}
		
		for(int a : arr) {
			System.out.println(a);
		}
	}
}
