import java.util.*;
public class CodeUp1083 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		while(count<=n) {
			if(count%3==0) {
				System.out.print("X ");
			}
			else { System.out.print(count+" "); }
			count++;
		}
	}
}
