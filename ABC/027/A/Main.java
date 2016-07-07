import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int l[] = new int[3];
		
		for(int i = 0; i < 3; i++){
			l[i] = sc.nextInt();
		}
		
		if(l[0]*l[0] - l[1]*l[2] == 0){
			System.out.println(l[0]);
		}
		else if(l[0] == l[1]){
			System.out.println(l[2]);
		}
		else if(l[0] == l[2]){
			System.out.println(l[1]);
		}
		else{
			System.out.println(l[0]);
		}
	}
}