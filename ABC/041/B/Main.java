import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		final long div = 1000000007;
		long a, b, c;
		
		a = sc.nextLong();
		b = sc.nextLong();
		c = sc.nextLong();
		
		long ans = a * c * b % div;
		
		System.out.println(ans);
	}
}