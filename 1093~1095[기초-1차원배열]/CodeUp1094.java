import java.util.*;
public class CodeUp1094 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for(int i=0;i<n;i++) {
			num[i] = sc.nextInt();
		}
		for(int j=(n-1);j>=0;--j) {
			System.out.print(num[j]+" ");
		}
	}
}
