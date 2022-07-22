import java.util.*;
public class CodeUp1090 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		double result = 1;
		for(int i=0;i<n;i++) {
			result=a*Math.pow(r, i);
		}
		System.out.print((int)result);
	}
}
