package studio3;
import java.util.Scanner;

public class Sieve2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print(" Enter Number ");
		int n = in.nextInt(); // n is size

		boolean var[] = new boolean[n];

		
		// Firstly, full the boolean array with true
		for(int j = 2; j < n; j++) {
			var[j] = true;
		}
		
		// Exclude any Composite number, change its value to false
		// Starting from 4, to check if there any Composite number
		// Checking indice: 2*2，2*3，2*4..2*20..3*3, 3*4....
		for (int index = 2 ; index < n; index++) {
			for (int i = index ; i * index  < n ; i++) {
				var[i*index] = false;
			}
		}
		
		for (int k = 0 ; k < n; k++) {
			if (var[k]==true) {
				System.out.print(k + " ");

			}
		}


	}

}
