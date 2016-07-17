import java.util.*;

public class Main {
	public static void main(String args[]) {
		int N, temp;
		int [][] a = new int[2][100000];
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			a[0][i] = i + 1;
			a[1][i] = sc.nextInt() * -1;
		}
		
		for (int i = 0; i < N; i++){
			for (int j = N - 1; j > i; j--){
				if(a[1][i] > a[1][j]){
					temp = a[1][i];
					a[1][i] = a[1][j];
					a[1][j] = temp;
					temp = a[0][i];
					a[0][i] = a[0][j];
					a[0][j] = temp;
				}
			}
		}
		
		for (int i = 0; i < N; i++){
			System.out.println(a[0][i]);
		}
	}
}