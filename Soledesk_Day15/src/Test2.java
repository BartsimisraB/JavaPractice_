import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
	public static void high(int arr[][], int a , int b) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				if(arr[i][j] < arr[i][j-1]) {
					temp = arr[i][j];
					arr[i][j] = arr[i][j-1];
					arr[i][j-1] = temp;
				}
			}
		}
		System.out.println(arr[a-1][b-1]);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] ary=new int[3][3];

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				ary[i][j] = sc.nextInt();
			}
		}
		high(ary,3,3);
	}
}
