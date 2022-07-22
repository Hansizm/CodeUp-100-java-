import java.util.*;
public class CodeUp1082 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int a = Integer.parseInt(n,16);
		for(int i=1;i<16;i++) {
			System.out.printf("%H*%H=%H%n", a, i, a*i);
		}
	}
}
