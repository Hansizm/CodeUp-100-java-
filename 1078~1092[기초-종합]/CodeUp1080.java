import java.util.*;
public class CodeUp1080 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int count = 0;
		for(int i=1;sum<n;i++) {
			sum+=i;
			count = i;
		}
		System.out.print(count);
	}
}
