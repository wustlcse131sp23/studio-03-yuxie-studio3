package studio3;
import java.util.Scanner;

public class Sieve2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print(" Enter Number ");
		int n = in.nextInt(); // n is size

		boolean var[] = new boolean[n];

		for(int j = 2; j < n; j++) {
			var[j] = true;
		}
		
		for (int index = 2 ; index < n; index++) {
			for (int i =index ; i * index  < n ; i++) {
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
