import java.util.*;

public class Main{
	int n, x;
	
	Main(int n, int x){
		this.n = n;
		this.x = x;
	}
	
	int getMin(){
		return Math.min(x - 1, n - x);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		Main qa = new Main(n, x);
		
		int ans = qa.getMin();
		
		System.out.println(ans);
	}
}