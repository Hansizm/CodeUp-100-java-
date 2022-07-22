import java.util.*;
public class CodeUp1087 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i=0;sum<n;++i) {
			sum+=i;
		}
		System.out.print(sum);
	}
}
